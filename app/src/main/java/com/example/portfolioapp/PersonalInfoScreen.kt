package com.example.portfolioapp

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun PersonalInfoScreen(navController: NavHostController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "Luiz Estrela de Farias III", fontSize = 24.sp)
        Text(text = "Endereço: XXXXXXX", fontSize = 16.sp)
        Text(text = "Telefone: (81) 99999-9999", fontSize = 16.sp)
        Text(text = "Email: estrela.luiz@uol.com.br", fontSize = 16.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("home") }) {
            Text("Voltar")
        }
    }
}

