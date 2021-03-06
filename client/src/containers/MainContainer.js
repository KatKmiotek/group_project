import React, { Component, Fragment } from 'react';
import Request from '../helpers/Request.js';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import NavBar from '../NavBar';
import Home from '../components/Home.js';
import ProductList from '../components/ProductList.js';
import ProductDetail from '../components/ProductDetail.js';
import ShoppingCart from '../components/ShoppingCart.js';
import SearchBar from '../components/SearchBar.js';
import Checkout from "../components/Checkout.js";
import AfterPurchase from '../components/AfterPurchase.js';
import Footer from '../Footer.js'
import Delivery from '../Delivery.js'
import About from '../About.js'
import Contact from '../Contact.js'
import Confirmation from "../components/Confirmation.js";


class MainContainer extends Component {
  constructor(props) {
    super(props);
    this.state = {
      products: [],
      cart: [],
    };
    this.handleRemove = this.handleRemove.bind(this);
    this.handleAddToCart = this.handleAddToCart.bind(this);
    this.handleOrder = this.handleOrder.bind(this);
  }

  componentDidMount() {
    const request = new Request();
    request.get('http://localhost:8080/api/products')
    .then(data => {
      this.setState({ products: data });
    });
  }


  findProductById(id) {
    return this.state.products.find(product => {return product.id === parseInt(id);});
  }

  getProductyByCategory(category) {
    return this.state.products.filter(product => product.category === category);
  }

  handleAddToCart(product){

    const newCart = [...this.state.cart, product];
    this.setState({ cart: newCart });
  }

  handleRemove(product){
    let cartIndex = this.state.cart.findIndex(item => item.id === product.id);
    if(cartIndex > -1){
    const newCart = [...this.state.cart];
    newCart.splice(cartIndex, 1);
    this.setState({ cart: newCart})}
  }

  handleOrder(order){
    const request = new Request();
    for(let product of order.products){
      console.log(product)
      request.update('http://localhost:8080/api/products/edit/' + product.id, product)}


    request.post('http://localhost:8080/api/orders', order)
      .then(() => {
        console.log(order);
        window.location = '/confirmation'
      })
    }




  render () {
    const basketTotal = this.state.cart.reduce((total, product)=>{
      return total + product.price
    }, 0);
    return (

      <Router >
      <Fragment>
      <NavBar shoppingCart={this.state.cart}/>
      <Switch >
      <Route path='/home' render={()=> {
          return <Home products={this.state.products}/>;
        }}/>
      <Route path='/products/beers' render={()=> {
          const products = this.getProductyByCategory('BEER');
          return <ProductList products={products} addToCart={this.handleAddToCart}/>;
        }}/>
      <Route path='/products/wines' render={()=> {
          const products = this.getProductyByCategory('WINE');
          return <ProductList products={products} addToCart={this.handleAddToCart}/>;
        }}/>
      <Route path='/products/gins' render={()=> {
          const products = this.getProductyByCategory('GIN');
          return <ProductList products={products} addToCart={this.handleAddToCart}/>;
        }}/>
      <Route path='/products/rums' render={()=> {
          const products = this.getProductyByCategory('RUM');
          return <ProductList products={products} addToCart={this.handleAddToCart}/>;
        }}/>
      <Route exact path='/products/:id' render={(props)=> {
        const id = props.match.params.id;
        const product = this.findProductById(id);
        return <ProductDetail product={product} addToCart={this.handleAddToCart}/>;
      }}/>
      <Route path='/products' render={()=> {
        return <ProductList products={this.state.products} addToCart={this.handleAddToCart}/>;
      }}/>
      <Route path="/shoppingCart" render={()=> {
        return <ShoppingCart basket={this.state.cart} removeFromCart={this.handleRemove} cartTotal={basketTotal.toFixed(2)}/>;
      }}/>
      <Route path="/search" render={()=> {
        return <SearchBar products={this.state.products} addToCart={this.handleAddToCart}/>;
      }}/>
      <Route path="/checkout" render={()=> {
        return <Checkout cart={this.state.cart} placeOrder={this.handleOrder} cartTotal={basketTotal.toFixed(2)}/>;
      }}/>
      <Route path="/delivery" render={()=> {
        return <Delivery/>;
      }}/>
      <Route path="/about" render={()=> {
        return <About/>;
      }}/>
      <Route path="/contact" render={()=> {
        return <Contact/>;
      }}/>
      <Route path="/confirmation" render={()=> {
        return <Confirmation/>;
      }}/>


      </Switch>
      <Footer/>
      </Fragment>
      </Router>
    );
  }
}

export default MainContainer;
