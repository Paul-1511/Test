package uvg.edu.gt.screens


import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MyApp() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "Inicio") {
        composable("Inicio") { InicioScreen(navController) }
        composable("Empezar Juego") { EmpezarJuegoScreen(navController) }
        composable("Juego") { JuegoScreen(navController) }
        composable("Amigos") { AmigosScreen(navController) }
        composable("perfil_amigo") { PerfilAmigoScreen(navController) }
    }
}