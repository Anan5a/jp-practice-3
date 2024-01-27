package com.sayempro.oldfblikenavigation

data class Dessert(
    val id: Int,
    val resId: Int,
    val title: String,
    val origin: String,
    val desc: String
) : ListItem() {
    companion object {
        private val desserts = listOf(
            Dessert(
                getUUID(),
                R.drawable.d1_mochi,
                "Mochi",
                "Japan",
                "Mochi, the tiny cakes made out of glutinous rice, are an important part of Japanese cuisine and culture. The preparation of mochi starts with a time-consuming process of pounding boiled or steamed rice, usually the glutinous mochigome variety until it forms into a thick and homogenous paste."
            ),
            Dessert(
                getUUID(),
                R.drawable.d2_cupcake,
                "Cupcake",
                "USA",
                "A cupcake is a tiny cake that is baked in a thin paper mold or an aluminum cup. One cupcake should typically serve one person. The first mention of a cupcake can be traced back to a 1796 cookbook called American Cookery, written by Amelia Simmons."
            ),
            Dessert(
                getUUID(),
                R.drawable.d3_brownies,
                "Brownies",
                "USA",
                "Deliciously chewy, dense and fudgy with a rich chocolate flavor, the beloved brownies are one of the most popular American desserts. Some claim that Bertha Palmer, wife of the owner of Palmer House Hotel, asked the chef to invent a new chocolate dessert to serve at the 1893 Colombian Exposition."
            ),
            Dessert(
                getUUID(),
                R.drawable.d4_wagashi,
                "Wagashi",
                "Japan",
                "Wagashi are traditional Japanese sweets that are usually made from natural, plant-based ingredients such as grains and azuki beans. The sweet treats are typically served with tea and are classified into three categories: namagashi (fresh confectionery), han namagashi (half-dry confectionery), and higashi (dry confectionery)."
            ),
            Dessert(
                getUUID(),
                R.drawable.d5_chocolate_chip,
                "Chocolate chip cookie",
                "USA",
                "Usually accompanied by a glass of milk or a cup of hot tea or coffee, chocolate chip cookies are well balanced between salty and sweet in flavor, tenderly chewy in texture, and filled with small melting chocolate pyramids, bringing a generation of Americans back to their childhood."
            ),
            Dessert(
                getUUID(),
                R.drawable.d6_doughnut,
                "Doughnut",
                "USA",
                "Although archaeologists had found some petrified remains of fried cakes with holes in the center, it is still unclear how could the early Native Americans prepare these delicious fried dough desserts that we know today as doughnuts. In the past, doughnuts were known as olykoeks (oily cakes), and the pilgrims from Holland are credited for bringing them to the United States."
            ),
            Dessert(
                getUUID(),
                R.drawable.d7_tiramisu,
                "Tiramisu",
                "Italy",
                "Even though tiramisù is actually a fairly recent invention, this dessert of coffee-soaked ladyfingers layered with mascarpone cream enjoys an iconic status among Italian desserts. Its name stems from the phrase tirami sù, an Italian expression which literally means pick me up, a reference to the uplifting effects of sugar, liquor, and coffee."
            ),
            Dessert(
                getUUID(),
                R.drawable.d8_milkshake,
                "Milkshake",
                "USA",
                "Milkshakes are usually described as flavored milk and ice cream beverages, usually lavishly decorated and served cold. The first written mention, dating from 1885, was somewhat different, and the word was used to refer to a whiskey drink, similar to eggnog, which was used as a health remedy."
            ),
            Dessert(
                getUUID(),
                R.drawable.d9_macarons,
                "Macarons",
                "France",
                "These small, round, sweet meringue-based cookie sandwiches with filling in the middle are light and crunchy on the outside and chewy in the middle. Macarons, which first appeared in Italy in 1533 (albeit without the filling), got their name from the Italian word maccherone, which means fine dough."
            ),
            Dessert(
                getUUID(),
                R.drawable.d10_churros,
                "Churros",
                "Spain",
                "Elongated, crispy, crunchy and intensely fragrant, churros consist of deep-fried yeast dough encrusted with sugar. Although some may argue against consuming these sweet treats, warning others about the dangerous effects of sugar and fat on human bodies, the popularity of churros throughout the world doesn't seem to wane."
            ),
            Dessert(
                getUUID(),
                R.drawable.d11_froyo,
                "Frozen Yoghurt",
                "USA",
                "Frozen yogurt is a frozen dessert treat made with yogurt and (sometimes) other dairy products and flavorings. It is lower in fat than ice cream due to the use of milk instead of cream. Frozen yogurt is usually served with numerous toppings such as strawberries, bananas, or chunks of cookies and candy."
            ),
            Dessert(
                getUUID(),
                R.drawable.d12_dondurma,
                "Dondurma",
                "Turkiye",
                "Turkish ice cream is believed to originate from the city of Maraş—hence the name—and what really sets it apart from other varieties is its resistance to melting and a particularly dense, chewy texture. These qualities are brought by adding two thickening agents to the basic milk and sugar mixture: Arab gum, also known as mastic resin, and salep—a type of flour made from the root of the early purple orchid."
            ),
            Dessert(
                getUUID(),
                R.drawable.d13_fudge,
                "Fudge",
                "USA",
                "Fudge is a creamy American confectionery made with milk, sugar, butter, and various toppings and flavorings. It is created by boiling milk, butter, and sugar to a degree of 240 °F/116 °C, and then beating it while it cools down, creating creamy but firm blocks which are later cut into delicate individual pieces."
            ),
            Dessert(
                getUUID(),
                R.drawable.d14_nougat,
                "Nougat",
                "Italy",
                "This is one of the oldest types of confections, and varieties can be found throughout Italy, Spain, France, the Balkans, and the Middle East. Although each region has its own distinctive type, most nougats are made of whipped egg white mixed with roasted chopped nuts such as almonds, pistachios, walnuts, and hazelnuts."
            ),
            Dessert(
                getUUID(),
                R.drawable.d15_apple_pie,
                "Apple pie",
                "USA",
                "Although England has a long history of making meat and fruit pies, and it was the inspiration for the American versions, there is nothing that is more synonymous with American desserts than the apple pie. In the United States, apple pies are found everywhere from big grocery shops and restaurants to coffee shops and home bakers, baked until the double crust is golden brown, filled with cinnamon-sugar coated apples."
            ),
            Dessert(
                getUUID(),
                R.drawable.d16_eclair,
                "Eclair",
                "France",
                "These elongated pastries with an appealing glaze, a crispy exterior, a soft doughy interior, and a sweet, creamy center originated in France at the turn of the 20th century. Most food historians believe they were invented by Marie-Antoine Carême, a famous French chef. Éclairs (French for lightning) are believed to have received their name because of how the light would reflect off of them after a coating of confectioner’s glaze."
            ),
            Dessert(
                getUUID(),
                R.drawable.d17_pavlova,
                "Pavlova",
                "New Zealand",
                "Delicate as the ballerina it was named after, Pavlova is the quintessential summer dessert. Whipped cream is typically dolloped on top of a snowy meringue, followed by a pop of color in the form of fruit, preferably the tart varieties which contrast the sweetness of the meringue."
            ),
            Dessert(
                getUUID(),
                R.drawable.d18_pannacotta,
                "Panna cotta",
                "Italy",
                "Simplicity at its finest, this softly set pudding takes almost no effort to make, yet is nothing short of amazing! Even though panna cotta (lit. cooked cream) wasn't mentioned in Italian cookbooks until the 1960s, today it is considered a traditional Piedmontese dessert, and the original recipe calls for only whole cream, sugar, vanilla, and gelatin."
            ),
            Dessert(
                getUUID(),
                R.drawable.d19_crumble,
                "Crumble",
                "UK",
                "Regarded as close cousins of pies, crumbles are simple and hearty baked creations made with sweet or savory ingredients. The sweet varieties usually consist of fruit that is placed on the bottom of the tray and topped with a crumbly mixture of butter, sugar, and flour."
            ),
            Dessert(
                getUUID(),
                R.drawable.d20_tteok,
                "Tteok",
                "South Korea",
                "Tteok are traditional Korean rice cakes that are prepared with glutinous or non-glutinous rice. The cakes are incredibly versatile, and although they are mostly sweet and enjoyed as a dessert, some plain varieties can be incorporated into savory dishes."
            ),
        )

        fun getAllDesserts() = desserts
    }
}