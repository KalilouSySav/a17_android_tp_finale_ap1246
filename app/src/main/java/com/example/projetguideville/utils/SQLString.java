package com.example.projetguideville.utils;

public class SQLString {
    private static String rawQuery = "-- Ajout d'un bâtiment\n" +
            "INSERT INTO Building (name, address, description)\n" +
            "VALUES ('La Basilique Notre-Dame', '110 Rue Notre-Dame O, Montréal, QC H2Y 1T2, Canada', 'La Basilique Notre-Dame est une célèbre église gothique située au cœur du Vieux-Montréal.');\n" +
            "\n" +
            "-- Ajout d'un service lié au bâtiment\n" +
            "INSERT INTO Service (name, description, building_id)\n" +
            "VALUES ('Visite guidée', 'Profitez d''une visite guidée pour découvrir l''histoire et l''architecture de la basilique.', 1);\n" +
            "\n" +
            "-- Ajout d'un autre bâtiment\n" +
            "INSERT INTO Building (name, address, description)\n" +
            "VALUES ('Le Vieux-Port de Montréal', '333 Rue de la Commune O, Montréal, QC H2Y 2E2, Canada', 'Le Vieux-Port de Montréal est un lieu animé où vous pouvez profiter de nombreuses activités et attractions.');\n" +
            "\n" +
            "-- Ajout d'un service lié au deuxième bâtiment\n" +
            "INSERT INTO Service (name, description, building_id)\n" +
            "VALUES ('Croisière sur le fleuve Saint-Laurent', 'Embarquez pour une croisière inoubliable sur le fleuve Saint-Laurent et profitez de vues panoramiques sur la ville.', 2);\n" +
            "\n" +
            "-- Ajout du bâtiment 3\n" +
            "INSERT INTO Building (name, address, description)\n" +
            "VALUES ('Le Mont-Royal', '1260 Chemin Remembrance, Montréal, QC H3H 1A2, Canada', 'Le Mont-Royal est une montagne emblématique offrant une vue panoramique sur la ville de Montréal.');\n" +
            "\n" +
            "-- Ajout du service lié au bâtiment 3\n" +
            "INSERT INTO Service (name, description, building_id)\n" +
            "VALUES ('Randonnée pédestre', 'Explorez les sentiers pittoresques du Mont-Royal lors d''une randonnée pédestre.', 3);\n" +
            "\n" +
            "-- Ajout du bâtiment 4\n" +
            "INSERT INTO Building (name, address, description)\n" +
            "VALUES ('Le Musée des beaux-arts de Montréal', '1380 Rue Sherbrooke O, Montréal, QC H3G 1J5, Canada', 'Le Musée des beaux-arts de Montréal abrite une vaste collection d''œuvres d''art et propose des expositions fascinantes.');\n" +
            "\n" +
            "-- Ajout du service lié au bâtiment 4\n" +
            "INSERT INTO Service (name, description, building_id)\n" +
            "VALUES ('Tour guidée de l''exposition actuelle', 'Découvrez l''exposition actuelle du Musée des beaux-arts de Montréal lors d''une visite guidée enrichissante.', 4);\n" +
            "\n" +
            "-- Ajout du bâtiment 5\n" +
            "INSERT INTO Building (name, address, description)\n" +
            "VALUES ('Le Jardin botanique de Montréal', '4101 Rue Sherbrooke E, Montréal, QC H1X 2B2, Canada', 'Le Jardin botanique de Montréal est un jardin botanique de 75 hectares qui abrite une collection de 22 000 espèces de plantes.');\n" +
            "\n" +
            "-- Ajout du service lié au bâtiment 5\n" +
            "INSERT INTO Service (name, description, building_id)\n" +
            "VALUES ('Découverte botanique', 'Participez à une visite interactive pour explorer les différentes espèces de plantes du Jardin botanique de Montréal.', 5);\n" +
            "\n" +
            "-- Ajout du bâtiment 6\n" +
            "INSERT INTO Building (name, address, description)\n" +
            "VALUES ('Le Biodôme de Montréal', '4777 Avenue Pierre-de Coubertin, Montréal, QC H1V 1B3, Canada', 'Le Biodôme de Montréal est un zoo qui abrite plus de 4 500 animaux de 250 espèces différentes.');\n" +
            "\n" +
            "-- Ajout du service lié au bâtiment 6\n" +
            "INSERT INTO Service (name, description, building_id)\n" +
            "VALUES ('Observation des animaux', 'Observez de près les animaux du Biodôme de Montréal lors d''une expérience immersive.', 6);\n" +
            "\n" +
            "-- Ajout du bâtiment 7\n" +
            "INSERT INTO Building (name, address, description)\n" +
            "VALUES ('Le Parc Jean-Drapeau', '1 Circuit Gilles Villeneuve, Montréal, QC H3C 1A9, Canada', 'Le Parc Jean-Drapeau est un parc de 268 hectares situé sur les îles Sainte-Hélène et Notre-Dame.');\n" +
            "\n" +
            "-- Ajout du service lié au bâtiment 7\n" +
            "INSERT INTO Service (name, description, building_id)\n" +
            "VALUES ('Excursion en bateau', 'Profitez d''une excursion en bateau pour découvrir les îles Sainte-Hélène et Notre-Dame et en apprendre davantage sur leur histoire.', 7);\n" +
            "\n" +
            "-- Ajout du bâtiment 8\n" +
            "INSERT INTO Building (name, address, description)\n" +
            "VALUES ('Le Casino de Montréal', '1 Avenue du Casino, Montréal, QC H3C 4W7, Canada', 'Le Casino de Montréal est un casino situé sur l''île Notre-Dame.');\n" +
            "\n" +
            "-- Ajout du service lié au bâtiment 8\n" +
            "INSERT INTO Service (name, description, building_id)\n" +
            "VALUES ('Divertissement au casino', 'Profitez d''une soirée de divertissement au Casino de Montréal avec des jeux de hasard, des spectacles et des restaurants.', 8);\n" +
            "\n" +
            "-- Ajout du bâtiment 9\n" +
            "INSERT INTO Building (name, address, description)\n" +
            "VALUES ('Le Parc du Mont-Royal', '1260 Chemin Remembrance, Montréal, QC H3H 1A2, Canada', 'Le Parc du Mont-Royal est un parc de 200 hectares situé sur le Mont-Royal.');\n" +
            "\n" +
            "-- Ajout du service lié au bâtiment 9\n" +
            "INSERT INTO Service (name, description, building_id)\n" +
            "VALUES ('Randonnée panoramique', 'Partez en randonnée dans le Parc du Mont-Royal pour profiter de vues panoramiques sur la ville de Montréal.', 9);\n" +
            "\n" +
            "-- Ajout du bâtiment 10\n" +
            "INSERT INTO Building (name, address, description)\n" +
            "VALUES ('Le Parc olympique de Montréal', '4141 Avenue Pierre-de Coubertin, Montréal, QC H1V 3N7, Canada', 'Le Parc olympique de Montréal est un parc de 89 hectares situé sur l''île Notre-Dame.');\n" +
            "\n" +
            "-- Ajout du service lié au bâtiment 10\n" +
            "INSERT INTO Service (name, description, building_id)\n" +
            "VALUES ('Ascension de la Tour', 'Montez au sommet de la Tour du Parc olympique de Montréal pour admirer la vue imprenable sur la ville.', 10);\n" +
            "\n" +
            "-- Ajout du bâtiment 11\n" +
            "INSERT INTO Building (name, address, description)\n" +
            "VALUES ('Le Stade olympique de Montréal', '4545 Avenue Pierre-de Coubertin, Montréal, QC H1V 0B2, Canada', 'Le Stade olympique de Montréal est un stade situé sur l''île Notre-Dame.');\n" +
            "\n" +
            "-- Ajout du service lié au bâtiment 11\n" +
            "INSERT INTO Service (name, description, building_id)\n" +
            "VALUES ('Visite du musée', 'Explorez le musée du Stade olympique de Montréal pour en apprendre davantage sur son histoire et ses moments emblématiques.', 11);\n" +
            "\n" +
            "-- Ajout du bâtiment 12\n" +
            "INSERT INTO Building (name, address, description)\n" +
            "VALUES ('Le Parc La Fontaine', '3819 Avenue Calixa-Lavallée, Montréal, QC H2L 3A7, Canada', 'Le Parc La Fontaine est un parc de 34 hectares situé dans le quartier du Plateau-Mont-Royal.');\n" +
            "\n" +
            "-- Ajout du service lié au bâtiment 12\n" +
            "INSERT INTO Service (name, description, building_id)\n" +
            "VALUES ('Pique-nique au parc', 'Profitez d''un pique-nique relaxant dans les espaces verdoyants du Parc La Fontaine.', 12);\n" +
            "\n" +
            "-- Ajout du bâtiment 13\n" +
            "INSERT INTO Building (name, address, description)\n" +
            "VALUES ('Le Vieux-Montréal', 'Vieux-Montréal, Montréal, QC, Canada', 'Le Vieux-Montréal est le quartier historique de Montréal, avec ses rues pavées, ses bâtiments anciens et son charme européen.');\n" +
            "\n" +
            "-- Ajout du service lié au bâtiment 13\n" +
            "INSERT INTO Service (name, description, building_id)\n" +
            "VALUES ('Visite à vélo', 'Explorez le Vieux-Montréal à vélo en compagnie d''un guide local pour découvrir son histoire et ses sites emblématiques.', 13);\n" +
            "\n" +
            "-- Ajout du bâtiment 14\n" +
            "INSERT INTO Building (name, address, description)\n" +
            "VALUES ('Le Musée des beaux-arts de Montréal', '1380 Rue Sherbrooke O, Montréal, QC H3G 1J5, Canada', 'Le Musée des beaux-arts de Montréal est l''un des plus importants musées d''art en Amérique du Nord, abritant une vaste collection d''œuvres d''art.');\n" +
            "\n" +
            "-- Ajout du service lié au bâtiment 14\n" +
            "INSERT INTO Service (name, description, building_id)\n" +
            "VALUES ('Visite audio-guidée', 'Parcourez le Musée des beaux-arts de Montréal avec une visite audio-guidée pour découvrir les différentes expositions et en apprendre davantage sur les artistes.', 14);\n" +
            "\n" +
            "-- Ajout du bâtiment 15\n" +
            "INSERT INTO Building (name, address, description)\n" +
            "VALUES ('Le Quartier des spectacles', 'Quartier des spectacles, Montréal, QC, Canada', 'Le Quartier des spectacles est le cœur culturel de Montréal, avec ses nombreux théâtres, salles de concert et festivals tout au long de l''année.');\n" +
            "\n" +
            "-- Ajout du service lié au bâtiment 15\n" +
            "INSERT INTO Service (name, description, building_id)\n" +
            "VALUES ('Visite des coulisses', 'Explorez les coulisses d''un théâtre ou d''une salle de concert dans le Quartier des spectacles et découvrez l''envers du décor.', 15);\n" +
            "\n" +
            "-- Ajout du bâtiment 16\n" +
            "INSERT INTO Building (name, address, description)\n" +
            "VALUES ('Le Marché Jean-Talon', '7070 Avenue Henri Julien, Montréal, QC H2S 3S3, Canada', 'Le Marché Jean-Talon est l''un des plus grands marchés publics de Montréal, offrant une variété de produits frais, de spécialités locales et une ambiance animée.');\n" +
            "\n" +
            "-- Ajout du service lié au bâtiment 16\n" +
            "INSERT INTO Service (name, description, building_id)\n" +
            "VALUES ('Visite gastronomique', 'Participez à une visite gastronomique au Marché Jean-Talon, dégustez des produits locaux et apprenez-en plus sur la cuisine québécoise.', 16);\n" +
            "\n" +
            "-- Ajout du bâtiment 17\n" +
            "INSERT INTO Building (name, address, description)\n" +
            "VALUES ('Le Musée d''histoire de Montréal', '335 Place d''Youville, Montréal, QC H2Y 2B5, Canada', 'Le Musée d''histoire de Montréal propose des expositions interactives et des artefacts qui racontent l''histoire fascinante de la ville.');\n" +
            "\n" +
            "-- Ajout du service lié au bâtiment 17\n" +
            "INSERT INTO Service (name, description, building_id)\n" +
            "VALUES ('Animation historique', 'Vivez une animation historique au Musée d''histoire de Montréal où des comédiens vous transportent à différentes époques marquantes de la ville.', 17);\n" +
            "\n" +
            "-- Ajout du service lié au bâtiment 18\n" +
            "INSERT INTO Service (name, description, building_id)\n" +
            "VALUES ('Découverte culinaire', 'Participez à une visite culinaire dans le Quartier chinois de Montréal pour déguster des spécialités asiatiques et en apprendre davantage sur la culture culinaire.', 18);\n" +
            "\n" +
            "-- Ajout du service lié au bâtiment 18\n" +
            "INSERT INTO Service (name, description, building_id)\n" +
            "VALUES ('Visite immersive', 'Explorez le Quartier chinois de Montréal avec un guide local pour découvrir ses restaurants, ses boutiques et ses festivals.', 18);\n" +
            "\n" +
            "\n" +
            "-- Ajout du bâtiment 19\n" +
            "INSERT INTO Building (name, address, description)\n" +
            "VALUES('Le Marché Atwater', '138 Avenue Atwater, Montréal, QC H4C 2G3, Canada', 'Le Marché Atwater est un marché public de Montréal, offrant une variété de produits frais, de spécialités locales et une ambiance animée.');\n" +
            "\n" +
            "-- Ajout du service lié au bâtiment 19\n" +
            "INSERT INTO Service (name, description, building_id)\n" +
            "VALUES ('Visite guidée du marché', 'Explorez le Marché Atwater de Montréal avec un guide local pour découvrir ses étals de produits frais, ses spécialités locales et son ambiance animée.', 19);\n" +
            "\n" +
            "-- Ajout du bâtiment 20\n" +
            "INSERT INTO Building (name, address, description)\n" +
            "VALUES('Le Canal de Lachine', 'Canal de Lachine, Montréal, QC, Canada', 'Le Canal de Lachine est un canal de navigation de 14,5 km de long qui relie le Vieux-Port de Montréal au Lac Saint-Louis.');\n" +
            "\n" +
            "-- Ajout du service lié au bâtiment 20\n" +
            "INSERT INTO Service (name, description, building_id)\n" +
            "VALUES ('Pédalo commentée', 'Profitez d''une croisière commentée en pédalo sur le Canal de Lachine pour découvrir l''histoire et les paysages pittoresques de Montréal le long du canal.', 20);\n" +
            "\n" +
            "-- Ajout du bâtiment 21\n" +
            "INSERT INTO Building (name, address, description)\n" +
            "VALUES('Le Quartier Latin', 'Quartier Latin, Montréal, QC, Canada', 'Le Quartier Latin est un quartier animé de Montréal, avec ses restaurants, ses boutiques et ses festivals.');\n" +
            "\n" +
            "-- Ajout du service lié au bâtiment 21\n" +
            "INSERT INTO Service (name, description, building_id)\n" +
            "VALUES ('Visite historique', 'Explorez le Quartier Latin de Montréal lors d''une visite guidée qui met l''accent sur l''histoire, l''architecture et les points d''intérêt du quartier.', 21);\n" +
            "\n" +
            "-- Ajout du bâtiment 22\n" +
            "INSERT INTO Building (name, address, description)\n" +
            "VALUES('La rue Sainte-Catherine', 'Rue Sainte-Catherine, Montréal, QC, Canada', 'La rue Sainte-Catherine est une rue commerçante de Montréal, avec ses boutiques, ses restaurants et ses festivals.');\n" +
            "\n" +
            "-- Ajout du service lié au bâtiment 22\n" +
            "INSERT INTO Service (name, description, building_id)\n" +
            "VALUES ('Shopping et festivals', 'Parcourez la rue Sainte-Catherine de Montréal avec un guide local pour découvrir ses boutiques, ses restaurants et participer aux festivals et événements qui s''y déroulent.', 22);\n" +
            "\n" +
            "-- Ajout du bâtiment 23\n" +
            "INSERT INTO Building (name, address, description)\n" +
            "VALUES('Le Centre Bell', '1909 Avenue des Canadiens-de-Montréal, Montréal, QC H4B 5G0, Canada', 'Le Centre Bell est une salle omnisports de Montréal, accueillant des matchs de hockey, des concerts et des événements sportifs.');\n" +
            "\n" +
            "-- Ajout du service lié au bâtiment 23\n" +
            "INSERT INTO Service (name, description, building_id)\n" +
            "VALUES ('Visite des coulisses', 'Explorez les coulisses du Centre Bell, assistez à une séance d''entraînement ou découvrez l''envers du décor lors d''une visite guidée.', 23);\n" +
            "\n" +
            "-- Ajout du bâtiment 24\n" +
            "INSERT INTO Building (name, address, description)\n" +
            "VALUES('Le Stade Saputo', '4750 Rue Sherbrooke E, Montréal, QC H1V 3S8, Canada', 'Le Stade Saputo est un stade de soccer de Montréal, accueillant des matchs de soccer et des événements sportifs.');\n" +
            "\n" +
            "-- Ajout du service lié au bâtiment 24\n" +
            "INSERT INTO Service (name, description, building_id)\n" +
            "VALUES ('Expérience soccer', 'Vivez une expérience immersive lors d''un match de soccer au Stade Saputo et découvrez l''ambiance passionnée des fans.', 24);\n" +
            "\n" +
            "\n" +
            "\n" +
            "-- Ajout du bâtiment 25\n" +
            "INSERT INTO Building (name, address, description)\n" +
            "VALUES('Le Marché Bonsecours', '350 Rue Saint-Paul E, Montréal, QC H2Y 1H2, Canada', 'Le Marché Bonsecours est un marché public de Montréal, offrant une variété de produits frais, de spécialités locales et une ambiance animée.');\n" +
            "\n" +
            "-- Ajout du service lié au bâtiment 25\n" +
            "INSERT INTO Service (name, description, building_id)\n" +
            "VALUES ('Visite culturelle et gastronomique', 'Participez à une visite immersive au Marché Bonsecours en compagnie d''un guide local qui vous fera découvrir l''histoire du marché et vous fera déguster des spécialités culinaires.', 25);\n" +
            "\n" +
            "-- Ajout du bâtiment 26\n" +
            "INSERT INTO Building (name, address, description)\n" +
            "VALUES('Le Marché Jean-Talon', '7070 Avenue Henri Julien, Montréal, QC H2S 3S3, Canada', 'Le Marché Jean-Talon est un marché public de Montréal, offrant une variété de produits frais, de spécialités locales et une ambiance animée.');\n" +
            "\n" +
            "-- Ajout du service lié au bâtiment 26\n" +
            "INSERT INTO Service (name, description, building_id)\n" +
            "VALUES ('Découverte gourmande', 'Explorez le Marché Jean-Talon lors d''une visite guidée gastronomique où vous pourrez déguster des produits locaux, rencontrer des artisans et en apprendre davantage sur la cuisine québécoise.', 26);\n" +
            "\n" +
            "-- Ajout du bâtiment 27\n" +
            "INSERT INTO Building (name, address, description)\n" +
            "VALUES('La Basilique Notre-Dame', '110 Rue Notre-Dame O, Montréal, QC H2Y 1T2, Canada', 'La Basilique Notre-Dame est une basilique de Montréal, offrant une architecture unique et une ambiance spirituelle.');\n" +
            "\n" +
            "-- Ajout du service lié au bâtiment 27\n" +
            "INSERT INTO Service (name, description, building_id)\n" +
            "VALUES ('Visite culturelle', 'Participez à une visite guidée de la Basilique Notre-Dame de Montréal pour en apprendre davantage sur son histoire, son architecture et son importance spirituelle.', 27);\n" +
            "\n" +
            "-- Ajout du bâtiment 28\n" +
            "INSERT INTO Building (name, address, description)\n" +
            "VALUES('La Biosphère', '160 Chemin Tour-de-l''Isle, Montréal, QC H3C 4G8, Canada', 'La Biosphère est un musée de Montréal, offrant une exposition sur l''environnement et une ambiance unique.');\n" +
            "\n" +
            "-- Ajout du service lié au bâtiment 28\n" +
            "INSERT INTO Service (name, description, building_id)\n" +
            "VALUES ('Exploration environnementale', 'Découvrez la Biosphère lors d''une visite guidée interactive axée sur les enjeux environnementaux, les énergies renouvelables et la protection de la planète.', 28);\n" +
            "\n" +
            "-- Ajout du bâtiment 29\n" +
            "INSERT INTO Building (name, address, description)\n" +
            "VALUES('Le Théâtre du Nouveau Monde', '84 Rue Sainte-Catherine O, Montréal, QC H2X 1Z6, Canada', 'Le Théâtre du Nouveau Monde est un théâtre de Montréal, offrant une variété de pièces de théâtre et une ambiance unique.');\n" +
            "\n" +
            "-- Ajout du service lié au bâtiment 29\n" +
            "INSERT INTO Service (name, description, building_id)\n" +
            "VALUES ('Visite théâtrale', 'Participez à une visite guidée du Théâtre du Nouveau Monde pour découvrir les coulisses, les costumes et en apprendre davantage sur le monde du théâtre.', 29);\n" +
            "\n" +
            "-- Ajout du bâtiment 30\n" +
            "INSERT INTO Building (name, address, description)\n" +
            "VALUES('Le Festival International de Jazz de Montréal', '305 Rue Sainte-Catherine O, Montréal, QC H2X 2A3, Canada', 'Le Festival International de Jazz de Montréal est un festival de Montréal, offrant une variété de concerts et une ambiance unique.');\n" +
            "\n" +
            "-- Ajout du service lié au bâtiment 30\n" +
            "INSERT INTO Service (name, description, building_id)\n" +
            "VALUES ('Concerts et découvertes', 'Explorez le Festival International de Jazz de Montréal lors d''une visite guidée qui met l''accent sur les différents concerts, les scènes et l''histoire du festival.', 30);";
    public static String getRawQuery() {
        return rawQuery;
    }
}
