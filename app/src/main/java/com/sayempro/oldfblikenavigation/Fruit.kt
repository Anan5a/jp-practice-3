package com.sayempro.oldfblikenavigation


data class Fruit(
    val id: Int,
    val resId: Int,
    val name: String,
    val origin: String,
    val desc: String
) : ListItem() {
    companion object {
        private val fruits = listOf(
            Fruit(
                getUUID(),
                R.drawable.f1_durian,
                "Durian",
                "Indonesia",
                "Often dubbed the king of fruit, durian is an unusual tropical fruit that grows throughout Southeast Asia. A large spiky outer shell reveals a creamy, almost custard-like flesh, which, besides boasting a mildly sweet flavor, is notorious for being incredibly rank-smelling."
            ),
            Fruit(
                getUUID(),
                R.drawable.f2_guava,
                "Guava",
                "Argentina",
                "Native to tropical America, from where it has spread to other tropical parts of the world, guava (Psidium guajava) is a fruit-bearing tree or bush that has long been harvested by the local indigenous people living in Argentina, especially in the northwestern province of Misiones."
            ),
            Fruit(
                getUUID(),
                R.drawable.f3_granny_smith,
                "Granny Smith",
                "Australia",
                "These world-famous green apples actually have Australian origins. According to legend, Maria Ann Smith found an apple seedling near her house in 1868. Shortly thereafter, it began to bear light green colored apples which proved to be perfect for both eating and cooking. Granny Smith apples were first commercially grown in New South Wales in 1895, and today, they are one of the most popular apple varieties in the world, characterized by their green exterior with a slight pink blush, bright white flesh, and firm texture."
            ),
            Fruit(
                getUUID(),
                R.drawable.f4_lychee,
                "Lychee",
                "China",
                "Lychee is a tropical fruit that's native to the Chinese provinces of Fujian and Guangdong. The fruit is oval to round, red in color, and has a brittle and inedible outer covering that encloses a translucent white flesh on the inside and one large seed."
            ),
            Fruit(
                getUUID(),
                R.drawable.f5_acai,
                "Açaí Berries",
                "Brazil",
                "The açaí palm is a palm tree cultivated for hearts of palm and for its fruit, known as the açaí berry. The berries are highly sought after due to their supposed medicinal properties, and they are often classified by producers as a type of \"superfood.\" They are a dark purple in color, resembling large blueberries."
            ),
            Fruit(
                getUUID(),
                R.drawable.f6_gala,
                "Gala",
                "New Zealand",
                "Gala is a variety of (typically) round-shaped apples characterized by their reddish-yellow color and a firm, crisp, yellow-tinged interior. Their flavor is slightly sweet with hints of vanilla, along with an accompanying floral aroma. The apples were discovered in 1934 in New Zealand by an orchardist named J."
            ),
            Fruit(
                getUUID(),
                R.drawable.f7_guarana,
                "Guarana",
                "Brazil",
                "Guarana is a plant that is cultivated throughout northern parts of Brazil and Venezuela, countries that are often praised for their berries. The name of the plant comes from the Guarani tribe that lives in Brazil. The tribe believes that guarana has magical properties and that it is a cure for many bowel problems."
            ),
            Fruit(
                getUUID(),
                R.drawable.f8_fuji,
                "Fuji Apples",
                "Japan",
                "Fuji is a Japanese variety of apple that was produced by cross-pollination of the Red Delicious and Virginia Ralls Janet varieties back in the late 1930s. This apple is distinguished by a red-yellow skin that surrounds its creamy white flesh that's renowned for its exceptional sweetness, low acidity, juiciness, firmness, and crispiness."
            ),
            Fruit(
                getUUID(),
                R.drawable.f9_red_delicious,
                "Red Delicious",
                "USA",
                "Red Delicious is one of the world's most common apple varieties, dating back to 1880, when it was discovered by Jesse Hiatt in Iowa. The apples were first known as Hawkeye, then Stark Delicious, and it wasn't until the emergence of Golden Delicious that these apples were renamed Red Delicious."
            ),
            Fruit(
                getUUID(),
                R.drawable.f10_golden_delicious,
                "Golden Delicious",
                "USA",
                "Golden Delicious is an apple variety that's believed to be a product of unintentional breeding between Grimes Golden and Golden Reinette. It has no connection to the Red Delicious. The original tree was discovered in West Virginia at the end of the 19th century, and it's been the official state fruit since 1995."
            ),
            Fruit(
                getUUID(),
                R.drawable.f11_pear,
                "Anjou Pear",
                "France",
                "D'Anjou is a pear variety that originated in Belgium or France in the mid-19th century. The pears are medium to large in size with an egg-shaped appearance. The skin ranges from yellow to light or bright green. The flesh is aromatic and tender in texture, while the flavor is sweet and juicy."
            ),
            Fruit(
                getUUID(),
                R.drawable.f12_mangosteen,
                "Mangosteen",
                "Indonesia",
                "Mangosteen, also known as purple mangosteen, is a tropical plant grown for its sweet fruit. Its origin is believed be on the Sunda Islands, now divided between Indonesia, Malaysia, Brunei, and East Timor. Mangosteen is characterized by its dark purple, firm shell which covers and protects the edible white fruit."
            ),
            Fruit(
                getUUID(),
                R.drawable.f13_gooseberry,
                "Cape Gooseberries",
                "Brazil",
                "Cape gooseberry is a plump yellow fruit, yielded from an unusual perennial plant native to high-altitude areas. The plant and the fruit share the same name, and are believed to have originated in Brazil, from where they spread to other South American highland regions, and eventually to other continents, primarily southern African regions and Australia, where they are still cultivated and used as a common ingredient."
            ),
            Fruit(
                getUUID(),
                R.drawable.f14_rambutan,
                "Rambutan",
                "Singapore",
                "Rambutan is a medium-sized evergreen tree originating from the rainforests of western Malaysia and Singapore. The trees produce fruits that are round with leathery skin that’s covered in soft hairlike spines. The colors range from dark red to yellow."
            ),
            Fruit(
                getUUID(),
                R.drawable.f15_tangelo,
                "Tangelo",
                "USA",
                "Tangelo is an evergreen tree with dense foliage that was first cultivated in Florida and southern California in 1897 as a cross between the Mandarin orange or a tangerine and either the pomelo or the grapefruit. Nowadays, it’s cultivated in tropical and subtropical climates."
            ),
            Fruit(
                getUUID(),
                R.drawable.f16_jabuticaba,
                "Jabuticaba",
                "Brazil",
                "Jabuticaba are traditional Brazilian berries native to the states of Minas Gerais, Goiás, and São Paolo. The berries are dark purple in color with a thick skin and they grow on tree trunks. Jabuticaba berries have a very short shelf life and begin to ferment 3 to 4 days after being picked, and the jabuticaba tree takes between 6 and 8 years to ear fruit, which is why these berries are so prized."
            ),
            Fruit(
                getUUID(),
                R.drawable.f17_braeburn,
                "Braeburn",
                "New Zealand",
                "Braeburn is a variety of apples with a red and yellow skin. Underneath it, there’s flesh that is spicy-sweet in flavor, with hints of cinnamon and nutmeg. This apple variety was discovered in 1952 in New Zealand by a farmer named O. Moran."
            ),
            Fruit(
                getUUID(),
                R.drawable.f18_honeycrisp,
                "Honeycrisp Apples",
                "USA",
                "Honeycrisp are American native apples originating from the University of Minnesota. They're also the state's official fruit. The apples were bred solely for their flavor, not for easy storing, shipping, or growing. They have a balanced sweet-tart flavor, and a crisp and juicy texture."
            ),
            Fruit(
                getUUID(),
                R.drawable.f19_lime,
                "Keffir Lime",
                "SE Asia",
                "Kaffir lime is an evergreen shrub that’s native to Southeast Asia. The fruits are green when unripe, turning yellow when ripe. The rind is warty, rough, and thick, while the pulp is very acidic and juicy with a few whitish seeds. The sour juice is often used in desserts, ice cream, beverages, and some seafood dishes."
            ),
            Fruit(
                getUUID(),
                R.drawable.f20_breadfruit,
                "Breadfruit",
                "Papua New Guineea",
                "Breadfruit is an evergreen tree that’s probably native to New Guinea and the Malay Archipelago. The fruits have a warty light green exterior, while the flesh is cream-colored and starchy. When ripe, the pulp of the breadfruit turns soft. It can be baked, stuffed, mashed, and roasted."
            ),
        )

        fun getAllFruits() = fruits
    }
}