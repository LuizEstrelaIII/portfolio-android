package com.example.portfolioapp

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Button(onClick = { navController.navigate("personal_info") }) {
            Text("Informações Pessoais")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { navController.navigate("skills") }) {
            Text("Habilidades")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { navController.navigate("experience") }) {
            Text("Experiências")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { navController.navigate("education") }) {
            Text("Educação")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { navController.navigate("projects") }) {
            Text("Projetos")
        }
    }
}
