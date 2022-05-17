#!/bin/sh

curl --location --request POST 'http://20.224.83.97/suppliers/1/products' \
--header 'Content-Type: application/json' \
--data-raw '{
                "productEcoLabels": [],
                "itemNumber": 1,
                "name": "AAC ECO 12 WALNUT WATER-BASED LACQUERED SOLID WALNUT - ECO BLACK",
                "description": "With the objective of recreating HAY'\''s iconic AAC chair from a more sustainable perspective, the About A Chair AAC 12 ECO uses recycled plastic (PP) to form the gently curved, open shell and symmetrical solid base that is consistent with the rest of the series. The lack of armrests ensures a clean, clutter-free silhouette, whilst the shaped back provides optimal comfort. The wooden frame with elegant, rounded legs conveys warmth and character, and ensures greater stability and a longer lifetime. The recycled shell is available in eco black and the base is available in solid FSC-certified oak with a water-based lacquer. The chair is EU Ecolabelled as a sign of environmental commitment, along with the other models in the ECO series – the AAC 22 ECO and AAS 32 in low and high versions.",
                "designer": "Hee Welling",
                "measurement": {
                    "length": 51,
                    "width": 505,
                    "height": 785
                },
                "subCategories": [],
                "co2Mesurability": null,
                "ecoTests": [],
                "createdAt": null,
                "updatedAt": null,
                "imageLink": "https://www.haystatic.com/img_20211214085952/globalassets/inriver/integration/service/943357zzzzzzzzzzzzzz_aac-12-eco-eco-black-shell_wb-lacquer-walnut-base_1220x1220_brandvariant.jpg?w=1100",
                "brochureLink": "https://hay.dk/en/hay/furniture/seating-18d7502d/chairs-b2b-626f7346/about-a-chair/aac12-eco-water-based-lacquered-walnut-base-eco-black-shell-"
            }';

echo "Product created!"

curl --location --request POST 'http://20.224.83.97/suppliers/1/products' \
--header 'Content-Type: application/json' \
--data-raw '{
                "productEcoLabels": [],
                "itemNumber": 1,
                "name": "AAC ECO 22 WALNUT WATER-BASED LACQUERED WALNUT VENEER - ECO WHITE",
                "description": "With the objective of recreating HAY'\''s iconic AAC chair from a more sustainable perspective, the About A Chair AAC 22 ECO uses recycled plastic (PP) to compose the functional simplicity that is characteristic of this entire series. The solid shell comprises a curved back with armrests, providing excellent comfort and a soft, unified silhouette, while the four-legged wooden base adds a timeless, classic expression, ensuring greater stability and a longer lifetime. The recycled shell is available in eco black and the base is available in FSC-certified oak with a water-based lacquer. The chair is EU Ecolabelled as a sign of environmental commitment, along with the other models in the ECO series – the AAC12 ECO and AAC 32 in low and high versions.",
                "designer": "Hee Welling",
                "measurement": {
                    "length": 520,
                    "width": 590,
                    "height": 790
                },
                "subCategories": [],
                "co2Mesurability": null,
                "ecoTests": [],
                "createdAt": null,
                "updatedAt": null,
                "imageLink": "https://www.haystatic.com/img_20211214082840/globalassets/inriver/integration/service/943448zzzzzzzzzzzzzz_aac-22-eco-eco-white_wb-lacquer-walnut-base_gb_910x1100_brandvariant.jpg?w=1100",
                "brochureLink": "https://hay.dk/en/hay/furniture/seating-18d7502d/chairs-b2b-626f7346/aac-eco-series-b2b/aac22-eco-water-based-lacquered-walnut-base-eco-white-shell"
            }';
echo "Product created!"

curl --location --request POST 'http://20.224.83.97/suppliers/1/products' \
--header 'Content-Type: application/json' \
--data-raw '{
                "productEcoLabels": [],
                "itemNumber": 1,
                "name": "AAS ECO 32",
                "description": "With the objective of recreating HAY'\''s iconic AAS stool from a more sustainable perspective, the About a Stool AAS 32 ECO uses recycled plastic (PP) to form the functional and minimalistic seat and backrest that is characteristic of this entire series. With its curved form and long, elegant wooden legs, it enjoys a simple yet strong visual presence that makes it ideal as a barstool in a public environment, as well as for informal meetings and meals. The recycled seat is available in eco black, the base is crafted in FSC-certified oak with a water-based lacquer and the footrest is made of steel. The stool is EU Ecolabelled as a sign of environmental commitment, along with the other chairs in the ECO series – the AAC 12 ECO and AAC 22. AAS 32 Eco is available in two different heights.",
                "designer": "Hee Welling",
                "measurement": {
                    "length": 430,
                    "width": 500,
                    "height": 850
                },
                "subCategories": [],
                "co2Mesurability": null,
                "ecoTests": [],
                "createdAt": null,
                "updatedAt": null,
                "imageLink": "https://www.haystatic.com/img_20211214094746/globalassets/inriver/integration/service/aas-eco-32_brandmodel.jpg?w=1100",
                "brochureLink": "https://hay.dk/en/hay/furniture/seating-18d7502d/bar-stool/aas-eco-series-b2b/aas-eco-32"
            }';
echo "Product created!"

curl --location --request POST 'http://20.224.83.97/suppliers/2/products' \
--header 'Content-Type: application/json' \
--data-raw '{
                "productEcoLabels": [],
                "itemNumber": 1,
                "name": "J45",
                "description": "Eg, Natur, Lakeret",
                "designer": "Børge Mogensen",
                "measurement": {
                    "length": 470,
                    "width": 470,
                    "height": 780
                },
                "subCategories": [],
                "co2Mesurability": null,
                "ecoTests": [],
                "createdAt": null,
                "updatedAt": null,
                "imageLink": "https://www.fdbmobler.dk/~/pir/products/ean/5715054006773%20(1).jpg?etag=68250B9&type=GenerateThumb&w=1180&h=1361",
                "brochureLink": "https://www.fdbmobler.dk/da/shop/stole/j45-stol-svanemaerket-j45s300210/natur/"
            }';
echo "Product created!"

curl --location --request POST 'http://20.224.83.97/suppliers/1/products' \
--header 'Content-Type: application/json' \
--data-raw '{
                "productEcoLabels": [],
                "itemNumber": 1,
                "name": "J52B",
                "description": "Bøg,Sort, Malet/Svanemærket",
                "designer": "Børge Mogensen",
                "measurement": {
                    "length": 560,
                    "width": 615,
                    "height": 901
                },
                "subCategories": [],
                "co2Mesurability": null,
                "ecoTests": [],
                "createdAt": null,
                "updatedAt": null,
                "imageLink": "https://www.fdbmobler.dk/~/pir/products/ean/5715054005516%20(1).jpg?etag=6825232&type=GenerateThumb&w=1140&h=1315",
                "brochureLink": "https://www.fdbmobler.dk/da/shop/laenestole/j52b-stol-j52b310112/sort-ral-9005/"
            }';
echo "Product created!"

curl --location --request POST 'http://20.224.83.97/suppliers/1/products' \
--header 'Content-Type: application/json' \
--data-raw '{
                "productEcoLabels": [],
                "itemNumber": 1,
                "name": "FRAME CHAIR",
                "description": "FRAME CHAIR er en eksklusiv stol til børn. Favourit til fjernsyn, men den er også god at klatre på! Den er konstrueret af rektangulære rammer i massiv eg med klassiske snedkersamlinger. De fire rammer danner den bærende konstruktion, der holder kanvas sæde og ryg, som er spændt op med flotte messing spænder. Kanvas er fremstillet af 100% certificeret økologisk bomuld fra KVADRAT, som kan tages af og maskinvaskes. SMALL er til børn i 1-5 års alderen BIG er til børn i 2-10 års alderen FRAME CHAIR med det hvide kanvas er svanemærket og lever dermed op til de strengeste krav mht. holdbarhed, slidstyrke, sikkerhed, kemi og miljø. Farvet kanvas er en særudgave. Den 100% certificeret økologisk kanvas liver farvet i Danmark, men er endnu ikke godkendt af Svanemærket. Bliver disse en permanent del af kollektionen, vil det blive ansøgt.",
                "designer": "Frederic Collette",
                "measurement": {
                    "length": 420,
                    "width": 420,
                    "height": 530
                },
                "subCategories": [],
                "co2Mesurability": null,
                "ecoTests": [],
                "createdAt": null,
                "updatedAt": null,
                "imageLink": "https://www.collectfurniture.dk/wp-content/uploads/2017/04/Frame-chair-small-natur.jpg",
                "brochureLink": "https://www.collectfurniture.dk/produkt/frame-stol/"
            }';
echo "Product created!"

curl --location --request POST 'http://20.224.83.97/suppliers/1/products' \
--header 'Content-Type: application/json' \
--data-raw '{
                "productEcoLabels": [],
                "itemNumber": 1,
                "name": "STOOL",
                "description": "STOOL er en børneskammel for at nå højt og en lille bænk til at sidde på. Vendt på hovedet bliver skamlen til en scooter til at køre på eller en vogn til leg. Den kan således bruges overalt og ikke mindst til at nå op til håndvasken på badeværelset eller i køkkenet. STOOL passer perfekt som siddeplads ved skrivepulten STOOLESK eller bordet FRAME table. Skamlen kan stables.STOOL er svanemærket og lever dermed op til de strengeste krav mht. holdbarhed, sikkerhed, kemi og miljø. STOOL er også CE certificeret.",
                "designer": "Frederic Collette",
                "measurement": {
                    "length": 200,
                    "width": 350,
                    "height": 220
                },
                "subCategories": [],
                "co2Mesurability": null,
                "ecoTests": [],
                "createdAt": null,
                "updatedAt": null,
                "imageLink": "https://www.collectfurniture.dk/wp-content/uploads/2017/04/stool-NSW1.jpg",
                "brochureLink": "https://www.collectfurniture.dk/produkt/stool-2/"
            }';
echo "Product created!"

curl --location --request POST 'http://20.224.83.97/suppliers/1/products' \
--header 'Content-Type: application/json' \
--data-raw '{
                "productEcoLabels": [],
                "itemNumber": 1,
                "name": "STOOLESK",
                "description": "STOOLESK er et bord og skammel for både voksne og børn. Det er børneskamlen STOOL i dobbelt størrelse. STOOLESK er skrivepult for børn fra 1-5 år siddende på børneskamlen STOOL. De passer perfekt sammen og fylder ikke meget: en ideal løsning så børn kan have deres plads i stuen eller i køkken alrum! STOOLESK har en hylde/lomme med plads til papir og blyanter på den ene side STOOLESK er også en voksen taburet, sofabord, sidebord eller sengebord, med plads til magasiner og TV-fjernkontrol.STOOLESK er svanemærket og lever dermed op til de strengeste krav mht. holdbarhed, sikkerhed, kemi og miljø.",
                "designer": "Frederic Collette",
                "measurement": {
                    "length": 380,
                    "width": 530,
                    "height": 410
                },
                "subCategories": [],
                "co2Mesurability": null,
                "ecoTests": [],
                "createdAt": null,
                "updatedAt": null,
                "imageLink": "https://www.collectfurniture.dk/wp-content/uploads/2020/10/stoolesk-S2-1024x1024.jpg",
                "brochureLink": "https://www.collectfurniture.dk/produkt/stoolesk-2/"
            }'
echo "Product created!"