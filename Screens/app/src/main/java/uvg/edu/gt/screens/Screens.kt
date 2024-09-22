package uvg.edu.gt.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InicioScreen(navController: NavHostController) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Inicio") }) }
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
        ) {
            Button(onClick = { navController.navigate("empezar_juego") }) {
                Text("Juegos")
            }
            Button(onClick = { navController.navigate("amigos") }) {
                Text("Amigos")
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EmpezarJuegoScreen(navController: NavHostController) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Empezar juego") }) }
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
        ) {
            Button(onClick = { navController.popBackStack() }) {
                Text("Back")
            }
            Button(onClick = { navController.navigate("juego") }) {
                Text("Empezar Juego")
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun JuegoScreen(navController: NavHostController) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Juego") }) }
    ) { innerPadding ->
        Button(modifier = Modifier.padding(innerPadding),
            onClick = { navController.popBackStack() }) {
            Text("Back")
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AmigosScreen(navController: NavHostController) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Amigos") }) }
    ) { innerPadding ->
        Column (
            modifier = Modifier.padding(innerPadding)
        ){
            Button(onClick = { navController.popBackStack() }) {
                Text("Back")
            }
            Button(onClick = { navController.navigate("perfil_amigo") }) {
                Text("Ver Perfil")
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PerfilAmigoScreen(navController: NavHostController) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Perfil amigo") }) }
    ) { innerPadding ->
        Button( modifier = Modifier.padding(innerPadding),
            onClick = { navController.popBackStack() }) {
            Text("Back")
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewInicioScreen() {
    InicioScreen(navController = rememberNavController())
}

@Preview(showBackground = true)
@Composable
fun PreviewEmpezarJuegoScreen() {
    EmpezarJuegoScreen(navController = rememberNavController())
}

@Preview(showBackground = true)
@Composable
fun PreviewJuegoScreen() {
    JuegoScreen(navController = rememberNavController())
}

@Preview(showBackground = true)
@Composable
fun PreviewAmigosScreen() {
    AmigosScreen(navController = rememberNavController())
}

@Preview(showBackground = true)
@Composable
fun PreviewPerfilAmigoScreen() {
    PerfilAmigoScreen(navController = rememberNavController())
}