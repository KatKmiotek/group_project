package com.codeclanexample.server.components;

import com.codeclanexample.server.models.Product;
import com.codeclanexample.server.models.ProductTypes;
import com.codeclanexample.server.repositories.OrderRepository;
import com.codeclanexample.server.repositories.ProductRepository;
import com.codeclanexample.server.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

<<<<<<< HEAD
        Product wine1 = new Product();
        Product wine2 = new Product();
        Product wine3 = new Product();
        Product wine4 = new Product();
        Product wine5 = new Product();
=======
        User user1 = new User("Kat Kmiotek", "123 New street", 33);
        userRepository.save(user1);
        User user2 = new User("Stuart Meldrum", "456 New street", 28);
        userRepository.save(user2);
        User user3 = new User("Craig Laws", "789 New street", 28);
        userRepository.save(user3);

        Product wine1 = new Product("El Viejo del Valle Sauvignon Gris 2019", 750, 10, 8.15, "The only Sauvignon Gris in our list – it's an aromatic cousin of Sauvignon Blanc. A fresh aroma of waxy lemons, lime and grapefruit.",
                "Chile", 13.00, "white", ProductTypes.WINE, "http://localhost:8080/api/images/el_viejo_sauv_gris.png");
        productRepository.save(wine1);
        Product wine2 = new Product("GENETIE Bourgogne Chardonnay ‘Illuminé’", 750, 10, 11.88, "A classic Chardonnay from Southern Burgundy - fine buttery and floral notes on the nose and a wine of substance and finesse on the palate. Some creamy textural notes up front reveal the discreet presence of oak.",
                "France", 13.00, "white", ProductTypes.WINE, "http://localhost:8080/api/images/genetie.png");
        productRepository.save(wine2);
        Product wine3 = new Product("Borsao Selección Blanco", 750, 10, 7.45, "Stone fruit and limey citrus aromas; with nectarine, subtle pineapple characters and a creamy mouthfeel. Gentle and well integrated oak.",
                "Spain", 13.00, "white", ProductTypes.WINE, "http://localhost:8080/api/images/borsao_white.png");
        productRepository.save(wine3);
        Product wine4 = new Product("Long Beach Shiraz", 750, 10, 7.25, "Long Beach Shiraz is an easy drinking, value for money", "Spain", 13.00, "red",
                ProductTypes.WINE, "http://localhost:8080/api/images/long_beach_shiraz_1.jpg");
        productRepository.save(wine4);
        Product wine5 = new Product("Chateauneuf du Pape Reserve des Oliviers", 750, 10, 21.20, "This Southern Rhone wine region is famous for the galets roules or 'pudding stones ' covering the ground allowing for heat retention to help enhance ripening of the grapes in the vineyards.",
                "Spain", 15.00, "red", ProductTypes.WINE, "http://localhost:8080/api/images/cdp_maison_favier.jpg");
        productRepository.save(wine5);
>>>>>>> develop

        Product beer1 = new Product("Big Drop Pine Trail Pale Ale", 330, 10, 2.50, "This dry-hopped pale ale is deliciously refreshing. The nose has hints of pine and honey. Packed full of flavour from citrus-heavy hops with a twist of fresh lime to create a crisp, zesty beer.",
                "England", 0.5, "Pale Ale", ProductTypes.BEER, "http://localhost:8080/api/images/pale_ale.jpg" );
        productRepository.save(beer1);
        Product beer2 = new Product("Bradfield Brewery - Farmers Blonde", 500, 10, 3.00, "This award-winning, very pale brilliant blonde beer has citrus and summer fruit aromas making it an extremely refreshing ale.",
                "England", 4.0, "blonde", ProductTypes.BEER, "http://localhost:8080/api/images/farmers_blonde.jpg");
        productRepository.save(beer2);
        Product beer3 = new Product("Guinness Draught Can", 440, 10, 3.50, "Iconic beer famed for its velvet texture, smooth flavour and distinctive colour.",
                "Ireland", 4.2, "Stout", ProductTypes.BEER, "http://localhost:8080/api/images/guinness_can.jpg");
        productRepository.save(beer3);
        Product beer4 = new Product("Estrella Damm Beer", 330, 10, 2.75, "Estrella Damm Beer is a pilsner beer the brings out the taste of Barcelona, where it is brewed, with it's stylish, trendy, vibrant and passionate style.",
                "Spain", 4.6, "Lager", ProductTypes.BEER, "http://localhost:8080/api/images/estrella-damm.png");
        productRepository.save(beer4);
        Product beer5 = new Product("Peroni Nastro Azzurro", 330, 10 , 2.60, "Peroni is one of the worlds most popular premium Italian lagers, crisp, refreshing and with a touch of Italian style.",
                "Italy", 5.3, "Lager", ProductTypes.BEER, "http://localhost:8080/api/images/peroni.jpg");
        productRepository.save(beer5);

        Product rum1 = new Product("Flor de Cana 7yr", 700, 10, 25.00,
                "Another gem from the Flor de Cana stable. The 7yr has hints of almond and vanilla, with a mild spiceyness",
<<<<<<< HEAD
                "Nicaraguan", 40.00, "gold", ProductTypes.RUM, "http://localhost:8080/api/images/flor_de_cana7yr.jpg");
        productRepository.save(rum1);
=======
                "Nicaraguan", 40.00, "gold", ProductTypes.RUM, "http://localhost:8080/api/images/flor_de_cana_7yr.jpg");
        productRepository.save(rum1);

>>>>>>> develop
        Product rum2 = new Product("O'Haras Spiced Rum", 700, 10, 24.50, "Fine Caribbean rum with added spice!",
                "Carabbean", 40.00, "spiced", ProductTypes.RUM, "http://localhost:8080/api/images/o_haras_spiced_rum.jpg");
        productRepository.save(rum2);

        Product rum3 = new Product("Plantation 3 Star White Rum", 700, 10, 24.00, "Plantation 3 Star White Rum contains a blend of rums from the '3 Stars of the Caribbean', namely Jamaica, Barbados and Trinidad to create this crisp, tasty Plantation rum.",
                "Caribbean", 40.00, "white", ProductTypes.RUM, "http://localhost:8080/api/images/plantation_3_star_rum.jpg");
        productRepository.save(rum3);

        Product rum4 = new Product("Ron Abuelo 7 yr", 700, 10, 22.00, "Ron Abuelo 7 yr is a Panamanian rum made using distillery grown sugar cane and aged in white oak barrels.",
                "Panama", 40.00, "dark", ProductTypes.RUM, "http://localhost:8080/api/images/ron_abuelo_7_years.jpg");
        productRepository.save(rum4);

        Product rum5 = new Product();
<<<<<<< HEAD
//
        Product gin1 = new Product("Audemus Pink Pepper", 700, 10, 45.00, "A wonderfully balanced spirit, the brand new Audemus Pink Pepper Gin reveals a blend of pink peppercorn, cardamom, juniper, vanilla, tonka and honey. ", "France", 44.00, "Regular", ProductTypes.GIN, "http://localhost:8080/api/images/pink_pep.jpg");
=======

        Product gin1 = new Product("Audemus Pink Pepper", 700, 10, 45.00, "A wonderfully balanced spirit, the brand new Audemus Pink Pepper Gin reveals a blend of pink peppercorn, cardamom, juniper, vanilla, tonka and honey.", "France", 44.00, "Regular", ProductTypes.GIN, "http://localhost:8080/api/images/pink_pep.jpg");
>>>>>>> develop
        productRepository.save(gin1);

        Product gin2 = new Product("Four Pillars Bloody Shiraz", 700, 10, 38.90, "This gin has flavours of fresh pine needles, citrus and spice, and a clear peppery, dense raspberry character. Due to a higher ABV than a sloe gin it packs a punch and is ideal in a range of cocktails.", "Australia", 37.8, "Flavoured", ProductTypes.GIN, "http://localhost:8080/api/images/four_pillars_shiraz.jpg" );
        productRepository.save(gin2);

        Product gin3 = new Product("G12 Grapefruit & Mandarin", 700, 10, 24.99, "Distilled with fresh mandarin, this gin delivers a complex juniper led, grapefruit citrus flavour. Accentuated by hints of spice from cassia, light floral coriander, finished with sweet mandarin.", "England", 37.5, "Flavoured", ProductTypes.GIN, "http://localhost:8080/api/images/g12_mandarin.png");
        productRepository.save(gin3);

        Product gin4 = new Product("The Botanist", 700, 10, 36.00, "The Botanist Islay Dry Gin is made from the guys from the Bruichladdich Distillery on Islay. Packed full of 31 Botanicals, 22 of which are found on Islay.", "Scotland", 46,  "Regular", ProductTypes.GIN, "http://localhost:8080/api/images/botanist.png");
        productRepository.save(gin4);

        Product gin5 = new Product("Jaffa Cake Gin", 700, 10, 28.00, "Jaffa Cake Gin is a delicious concoction from the ingenious distillers at Atom Labs. Distilled with juniper, fresh orange peel, cocoa powder and real Jaffa cakes, the team produces and blends each batch in Kent, UK.", "England", 42, "Regular", ProductTypes.GIN, "http://localhost:8080/api/images/jaffa-cake-gin.jpg");
        productRepository.save(gin5);

    }
}
