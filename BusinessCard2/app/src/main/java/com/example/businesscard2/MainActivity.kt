package com.example.businesscard2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard2.ui.theme.BusinessCard2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCard2Theme {
                Card()
            }
        }
    }
    @Composable
    fun Card(modifier: Modifier = Modifier){
        val x : Painter = painterResource(id = R.drawable.perfil)
        val context = LocalContext.current
        Column (
            modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = x,
                contentDescription = "foto de perfil",
                modifier = modifier.size(200.dp),
                alignment = Alignment.Center)

            Spacer(modifier = Modifier.height(16.dp))

            Text(text = "Carlos Rodríguez", fontSize = 40f.sp)

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Ingeniero Informático",
                fontSize = 30f.sp,
                color = MaterialTheme.colorScheme.primary
            )


            Spacer(modifier = Modifier.height(150.dp))
            // Número telefonico
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(id = R.drawable.telefono),
                    contentDescription = "telefono",
                    modifier = Modifier.size(35.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))

                Text(
                    text = "+51 999 888 777",
                    modifier = Modifier.wrapContentWidth(),
                    fontSize = 25f.sp,
                    maxLines = 1
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            //Red social
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(id = R.drawable.instagram),
                    contentDescription = "redes sociales",
                    modifier = Modifier.size(37.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))

                Text(
                    text = "@Carlito_Rodri_o",
                    modifier = Modifier.wrapContentWidth(),
                    fontSize = 25f.sp,
                    maxLines = 1
                )
            }

            Spacer(modifier = Modifier.height(16.dp))
            //Correo electronico
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(id = R.drawable.gmail),
                    contentDescription = "correo",
                    modifier = Modifier.size(35.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))

                Text(
                    text = "rodri@gmail.com",
                    modifier = Modifier.wrapContentWidth(),
                    fontSize = 25f.sp,
                    maxLines = 1
                )
            }
        }
    }

}