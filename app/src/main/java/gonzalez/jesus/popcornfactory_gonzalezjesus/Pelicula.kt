package gonzalez.jesus.popcornfactory_gonzalezjesus

import java.util.ArrayList

data class Pelicula (var titulo: String,
                     var image: Int,
                     var header: Int,
                     var sipnosis: String,
                     var seats: ArrayList<Cliente>)