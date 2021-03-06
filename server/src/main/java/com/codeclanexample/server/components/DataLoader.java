package com.codeclanexample.server.components;

import com.codeclanexample.server.models.Product;
import com.codeclanexample.server.models.ProductTypes;
import com.codeclanexample.server.models.User;
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


        User user1 = new User("Kat Kmiotek", "123 New street", 33);
        userRepository.save(user1);
        User user2 = new User("Stuart Meldrum", "456 New street", 28);
        userRepository.save(user2);
        User user3 = new User("Craig Laws", "789 New street", 28);
        userRepository.save(user3);

        Product wine1 = new Product("El Viejo del Valle Sauvignon Gris", 750, 10, 8.15, "The only Sauvignon Gris in our list – it's an aromatic cousin of Sauvignon Blanc. A fresh aroma of waxy lemons, lime and grapefruit.",
                "Chile", 13.00, "white", ProductTypes.WINE, "http://localhost:8080/api/images/el_viejo_sauv_gris.png");
        productRepository.save(wine1);
        Product wine2 = new Product("GENETIE Bourgogne Chardonnay", 750, 10, 11.88, "A classic Chardonnay from Southern Burgundy - fine buttery and floral notes on the nose and a wine of substance and finesse on the palate. Some creamy textural notes up front reveal the discreet presence of oak.",
                "France", 13.00, "white", ProductTypes.WINE, "http://localhost:8080/api/images/genetie.png");
        productRepository.save(wine2);
        Product wine3 = new Product("Borsao Selección Blanco", 750, 10, 7.45, "Stone fruit and limey citrus aromas; with nectarine, subtle pineapple characters and a creamy mouthfeel. Gentle and well integrated oak.",
                "Spain", 13.00, "white", ProductTypes.WINE, "http://localhost:8080/api/images/borsao_white.png");
        productRepository.save(wine3);
        Product wine4 = new Product("Long Beach Shiraz", 750, 10, 7.25, "Long Beach Shiraz is an easy drinking, value for money", "Spain", 13.00, "red",
                ProductTypes.WINE, "http://localhost:8080/api/images/long_beach_shiraz_1.jpg");
        productRepository.save(wine4);
        Product wine5 = new Product("Chateauneuf du Pape des Oliviers", 750, 10, 21.20, "This Southern Rhone wine region is famous for the galets roules or 'pudding stones ' covering the ground allowing for heat retention to help enhance ripening of the grapes in the vineyards.",
                "Spain", 15.00, "red", ProductTypes.WINE, "http://localhost:8080/api/images/cdp_maison_favier.jpg");
        productRepository.save(wine5);
        Product wine6 = new Product("Le Fou Pinot Noir, Pays d’Oc 2018", 750, 10, 8.70, "‘Le Fou’ translates as ‘The Madman’, as it has long been thought only a madman would try to produce the perfect Pinot Noir in southern France. Perfection achieved, myth dispelled.",
                "France", 13.00, "red", ProductTypes.WINE, "http://localhost:8080/api/images/le_fou.jpg");
        productRepository.save(wine6);
        Product wine7 = new Product("Cable Crossing Shiraz", 750, 10, 8.30, "Red, Warm and Spicy", "Spain", 13.00, "red", ProductTypes.WINE,
                "http://localhost:8080/api/images/cabel_crossing_shiraz.jpg");
        productRepository.save(wine7);
        Product wine8 = new Product("Primitivo Salento, Boheme", 750, 10, 9.00, "Harvested from vineyards in the heel of Italy and vinified using temperature-controlled stainless steel technology.",
                "Italy", 14.00, "red", ProductTypes.WINE, "http://localhost:8080/api/images/primitivo_salento.jpg");
        productRepository.save(wine8);
        Product wine9 = new Product("Nieto Don Nicanor Malbec, Mendoza", 750, 10, 12.40, "Brooding and intense. A classic Malbec. From Nieto's premium Agrelo vineyards, with flavours reminiscent of those desert soils. Dark, dense complex nose with sweet cranberries, blackberries and rich mocha characters.",
                "Spain", 14.00, "red", ProductTypes.WINE, "http://localhost:8080/api/images/don_nicanor_malbec.png");
        productRepository.save(wine9);
        Product wine10 = new Product("Benjamin Malbec 2018", 750, 10, 7.20, "Purple red in color, bright and intense. Fresh fruity aromas of plum and cherry. Balanced in the mouth with a pleasant finish.",
                "Spain", 14.00, "red", ProductTypes.WINE, "http://localhost:8080/api/images/benjamin_malbec.png");
        productRepository.save(wine10);
        Product wine11 = new Product("Sierra Grande Merlot", 750, 10, 7.25, "Juicy and fresh Chilean Merlot.", "Chile", 13.00, "red", ProductTypes.WINE,
                "http://localhost:8080/api/images/sierra_merlot.png");
        productRepository.save(wine11);
        Product wine12 = new Product("Fontessa Prosecco Spumante Brut", 750, 10, 8.82, "Fresh and fruity Prosecco with aromas of citrus and green apple. The palate has ripe grapey characters, zesty acidity and a clean, refreshing finish.",
                "Italy", 11.50, "white", ProductTypes.WINE, "http://localhost:8080/api/images/fontessa_prosecco.png");
        productRepository.save(wine12);


        Product beer1 = new Product("Big Drop Pine Trail Pale Ale", 330, 1, 2.50, "This dry-hopped pale ale is deliciously refreshing. The nose has hints of pine and honey. Packed full of flavour from citrus-heavy hops with a twist of fresh lime to create a crisp, zesty beer.",
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
        Product beer6 = new Product("Damm Lemon Beer", 330, 10, 1.20, "Damm Lemon beer is a refreshing, light drink, perfect for all occasions with its invigorating citrus filled taste. Made from the finest Mediterranean lemons in Barcelona, this delicious lemon beer is the ultimate summer's day BBQ cool down.",
                "Spain", 3.2, "Lager", ProductTypes.BEER, "http://localhost:8080/api/images/lemon-damm-bottle.png");
        productRepository.save(beer6);
        Product beer7 = new Product("Big Drop Paradiso", 330, 10, 1.50, "This IPA radiates citrus fruit from the moment you pour it to the second you finish that last sip with a satisfied sigh. The bright, sharp twist of bitterness on the end makes you want to dive back in for one more.",
                "England", 0.5, "Lager", ProductTypes.BEER, "http://localhost:8080/api/images/citra_-_bottle.jpg");
        productRepository.save(beer7);
        Product beer8 = new Product("Thornbridge Brewery - Jaipur IPA", 330, 10, 1.80, "With over 100 worldwide awards, this American style IPA has a complexity of flavours created by a six-dimensional hop experience. ",
                "England", 5.9, "Pale Ale", ProductTypes.BEER, "http://localhost:8080/api/images/jaipur.jpg");
        productRepository.save(beer8);
        Product beer9 = new Product("Mahou", 330, 10, 1.60, "Made with the best varieties of hops and yeast, it is known for its golden color and its characteristic mild flavor. The result: a perfectly balanced taste that lingers on the palate.",
                "Spain", 5.1, "Lager", ProductTypes.BEER, "http://localhost:8080/api/images/mahou330ml.jpg");
        productRepository.save(beer9);
        Product beer10 = new Product("Big Drop Sour", 330, 10, 1.50, "Big Drop’s Sour is Vegan-friendly with a new recipe that combines a stronger citrus aroma whilst delivering a sharper, more acetic twang. The palate is filled with sherbety refreshing goodness and sees subtle farmyard grain flavours coming through.",
                "England", 0.5, "Lager", ProductTypes.BEER, "http://localhost:8080/api/images/sour_-_bottle.jpg");
        productRepository.save(beer10);


        Product rum1 = new Product("Flor de Cana 7yr", 700, 10, 25.00,
                "Another gem from the Flor de Cana stable. The 7yr has hints of almond and vanilla, with a mild spiceyness", "Nicaraguan", 40.00, "gold", ProductTypes.RUM, "http://localhost:8080/api/images/flor_de_cana_7yr.jpg");
        productRepository.save(rum1);


        Product rum2 = new Product("O'Haras Spiced Rum", 700, 10, 24.50, "Fine Caribbean rum with added spice!",
                "Carabbean", 40.00, "spiced", ProductTypes.RUM, "http://localhost:8080/api/images/o_haras_spiced_rum.jpg");
        productRepository.save(rum2);

        Product rum3 = new Product("Plantation 3 Star White Rum", 700, 10, 24.00, "Plantation 3 Star White Rum contains a blend of rums from the '3 Stars of the Caribbean', namely Jamaica, Barbados and Trinidad to create this crisp, tasty Plantation rum.",
                "Caribbean", 40.00, "white", ProductTypes.RUM, "http://localhost:8080/api/images/plantation_3_star_rum.jpg");
        productRepository.save(rum3);

        Product rum4 = new Product("Ron Abuelo 7 yr", 700, 10, 22.00, "Ron Abuelo 7 yr is a Panamanian rum made using distillery grown sugar cane and aged in white oak barrels.",
                "Panama", 40.00, "dark", ProductTypes.RUM, "http://localhost:8080/api/images/ron_abuelo_7_years.jpg");
        productRepository.save(rum4);

        Product rum5 = new Product("Pirate's Grog Spiced", 700, 10, 32.50, "Pirate's Grog Spiced is an exotic infusion of salt, caramel, a touch of allspice and a secret ingredient, which can be found growing along the enchanting shores of Roatan, Honduras.", "England", 37.5, "Spiced", ProductTypes.RUM, "http://localhost:8080/api/images/styles.jpg");
        productRepository.save(rum5);

        Product rum6 = new Product("Wester White Rum", 500, 10 , 26.00, "Fully fermented and distilled from sugarcane molasses at Wester Distillery. This white rum is perfect for serving in a cocktail or with your mixer of choice.", "Glasgow", 40.00, "White", ProductTypes.RUM, "http://localhost:8080/api/images/wester.jpg" );
        productRepository.save(rum6);

        Product rum7 = new Product("Havana Club 3yrs", 700, 0, 20.95, "3-year-old rum has a light straw colour. It has at once the luminous, light, syrupy look characteristic of aged rum. This Cuban rum has a sweet, woody smell with aromas of caramel and vanilla.", "Cuba", 40.00, "White", ProductTypes.RUM, "http://localhost:8080/api/images/havana.jpg");
        productRepository.save(rum7);

        Product rum8 = new Product("Don Papa - 7yrs" ,700, 0, 33.54, "Distilled from some of the finest sugar cane in the world, Don Papa is first aged 7 years in oak barrels in the foothills of Mount Kanlaon before being blended to perfection.", "Philipines", 40.00, "Gold", ProductTypes.RUM, "http://localhost:8080/api/images/don_papa.jpg");
        productRepository.save(rum8);

        Product rum9 = new Product("Rumbullion", 700, 5, 32.05, "A shipshape spiced concoction made using a blend of fantastic Caribbean rum, creamy Madagascan vanilla, vibrant orange peel, clove, cinnamon and a pinch of cardamom.", "England", 42.6, "Spiced", ProductTypes.RUM, "http://localhost:8080/api/images/rumbullion.jpg");
        productRepository.save(rum9);

        Product rum10 = new Product("Bumbu", 700, 10, 35.53, "Bumbu Rum is based on the original recipe created by 16th and 17th century sailors of the West Indies, who blended native Caribbean ingredients into their rum and called it “Bumbu” - truly the original craft spirit.", "Panama", 35.00, "Gold", ProductTypes.RUM, "http://localhost:8080/api/images/bumbu.jpg");
        productRepository.save(rum10);



        Product gin1 = new Product("Audemus Pink Pepper", 700, 1, 45.00, "A wonderfully balanced spirit, the brand new Audemus Pink Pepper Gin reveals a blend of pink peppercorn, cardamom, juniper, vanilla, tonka and honey.", "France", 44.00, "Regular", ProductTypes.GIN, "http://localhost:8080/api/images/pink_pep.jpg");

        productRepository.save(gin1);

        Product gin2 = new Product("Four Pillars Bloody Shiraz", 700, 10, 38.90, "This gin has flavours of fresh pine needles, citrus and spice, and a clear peppery, dense raspberry character. Due to a higher ABV than a sloe gin it packs a punch and is ideal in a range of cocktails.", "Australia", 37.8, "Flavoured", ProductTypes.GIN, "http://localhost:8080/api/images/four_pillars_shiraz.jpg" );
        productRepository.save(gin2);

        Product gin3 = new Product("G12 Grapefruit & Mandarin", 700, 10, 24.99, "Distilled with fresh mandarin, this gin delivers a complex juniper led, grapefruit citrus flavour. Accentuated by hints of spice from cassia, light floral coriander, finished with sweet mandarin.", "England", 37.5, "Flavoured", ProductTypes.GIN, "http://localhost:8080/api/images/g12_mandarin.png");
        productRepository.save(gin3);

        Product gin4 = new Product("The Botanist", 700, 10, 36.00, "The Botanist Islay Dry Gin is made from the guys from the Bruichladdich Distillery on Islay. Packed full of 31 Botanicals, 22 of which are found on Islay.", "Scotland", 46,  "Regular", ProductTypes.GIN, "http://localhost:8080/api/images/botanist.png");
        productRepository.save(gin4);

        Product gin5 = new Product("Jaffa Cake Gin", 700, 10, 28.00, "Jaffa Cake Gin is a delicious concoction from the ingenious distillers at Atom Labs. Distilled with juniper, fresh orange peel, cocoa powder and real Jaffa cakes, the team produces and blends each batch in Kent, UK.", "England", 42, "Regular", ProductTypes.GIN, "http://localhost:8080/api/images/jaffa-cake-gin.jpg");
        productRepository.save(gin5);

        Product gin6 = new Product("O'ndina Gin", 700, 5, 32.00, "Inspired by the effortless glamour and carefree spirit of the Italian Riviera in the 1960s, O’ndina is a super-premium Italian gem that embodies the spirit of La Dolce Vita.", "Italy", 45, "Regular", ProductTypes.GIN, "http://localhost:8080/api/images/o_ndina_gin.jpg");
        productRepository.save(gin6);

        Product gin7 = new Product("Cotswolds Ginger Gin", 500, 8, 38.95, "Cotswolds Ginger Gin is a warming and spicy barrel-aged gin combining Cotswolds Dry Gin, American oak barrels, candied ginger and fresh orange peel to create a spirited gin with exceptional depth of flavour.", "England", 46, "Flavoured", ProductTypes.GIN, "http://localhost:8080/api/images/costwold_ginger.png");
        productRepository.save(gin7);

        Product gin8 = new Product("Deaths Door Gin", 700, 4, 28.50, "Deaths Door Gin comes from Washington Island in Wisconsin and is made with organic red winter wheat. It has been bottled at a higher than usual strength, so use a bit less or add more tonic.", "USA", 47, "Regualar", ProductTypes.GIN, "http://localhost:8080/api/images/gin_dea1.jpg");
        productRepository.save(gin8);

        Product gin9 = new Product("Holy Grass Vodka", 700, 7, 27.00, "Found on the banks of Thurso River, Holy Grass gives this Vodka a wonderful, unique taste. Delicate and fresh with a creamy smooth finish", "Scotland", 41.5, "Regualar", ProductTypes.GIN, "http://localhost:8080/api/images/holy_grass_vodka.jpg");
        productRepository.save(gin9);

    }
}
