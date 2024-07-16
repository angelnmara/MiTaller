package com.lamarrulla.mitallerkot

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lamarrulla.mitallerkot.relay.compose.RowScopeInstanceImpl.weight

class Cliente{
    val nombre = "Mecanica Automotriz"
    val especialidad = "Especialista en transmiciones"
    val image: Int = R.drawable.usuario_home_user_3_image_45
}

/*@Preview(name = "NEXUS_7", device = Devices.NEXUS_7)
@Preview(name = "NEXUS_7_2013", device = Devices.NEXUS_7_2013)
@Preview(name = "NEXUS_5", device = Devices.NEXUS_5)
@Preview(name = "NEXUS_6", device = Devices.NEXUS_6)
@Preview(name = "NEXUS_9", device = Devices.NEXUS_9)
@Preview(name = "NEXUS_10", device = Devices.NEXUS_10)
@Preview(name = "NEXUS_5X", device = Devices.NEXUS_5X)
@Preview(name = "NEXUS_6P", device = Devices.NEXUS_6P)
@Preview(name = "PIXEL_C", device = Devices.PIXEL_C)
@Preview(name = "PIXEL", device = Devices.PIXEL)
@Preview(name = "PIXEL_XL", device = Devices.PIXEL_XL)
@Preview(name = "PIXEL_2", device = Devices.PIXEL_2)
@Preview(name = "PIXEL_2_XL", device = Devices.PIXEL_2_XL)
@Preview(name = "PIXEL_3", device = Devices.PIXEL_3)
@Preview(name = "PIXEL_3_XL", device = Devices.PIXEL_3_XL)
@Preview(name = "PIXEL_3A", device = Devices.PIXEL_3A)
@Preview(name = "PIXEL_3A_XL", device = Devices.PIXEL_3A_XL)
@Preview(name = "PIXEL_4", device = Devices.PIXEL_4)
@Preview(name = "PIXEL_4_XL", device = Devices.PIXEL_4_XL)
@Preview(name = "AUTOMOTIVE_1024p", device = Devices.AUTOMOTIVE_1024p)*/
@Preview
@Composable
fun CardClientePreview(){
    ClienteCardRow(
        Cliente(),
        Modifier
            .background(
                MaterialTheme
                    .colorScheme.background
            )
            .padding(10.dp))
}

@Preview
@Composable
fun MiTablero(){
    MiTableroRow()
}

@Preview
@Composable
fun MiCalificacion(){
    Calificacion(5);
}

@Preview
@Composable
fun MiHomePrincipal(){
    HomePrincipal(Modifier);
}

@Composable
fun HomePrincipal(modifier: Modifier){
    Row {
        Image(painter = painterResource(
            id = R.drawable.usuario_home_user_3_vector25),
            contentDescription = "imagen menu",
            Modifier.background(MaterialTheme.colorScheme.primary)
        )
        Column(modifier = Modifier
            .padding(10.dp)
            .weight(1f)
            .background(Color.Red)
            .align(Alignment.CenterVertically)) {
            Box(){
                Column {
                    ClienteAvatar(cliente = Cliente())
                }
            }
            Text("24 de Abril del 2024")
            Text("David Rincon Angeles")
        }
        Box(){
            Image(
                painter = painterResource(id = R.drawable.usuario_home_user_3_vector27),
                contentDescription = "imagen chat trasero",
                modifier = Modifier.align(Alignment.Center),
                colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.primary)
            )
            Image(
                painter = painterResource(id = R.drawable.usuario_home_user_3_vector26),
                contentDescription = "imagen chat delantero",
                modifier = Modifier.align(Alignment.Center),
                colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.primary)
            )
        }
    }
}

@Composable
fun MiTableroRow(){
    Row(modifier = Modifier
        .fillMaxWidth()
        .background(MaterialTheme.colorScheme.background)
        .padding(10.dp)
    ) {
        MiIconoConTexto(
            image = R.drawable.examples_home_mobile_vector,
            nombreIcono = "Vehiculos"
        )
        MiIconoConTexto(
            image = R.drawable.examples_home_mobile_vector1,
            nombreIcono = "MisCreditos"
        )
        MiIconoConTexto(
            image = R.drawable.examples_home_mobile_vector2,
            nombreIcono = "Vehiculos Taller"
        )
        MiIconoConTexto(
            image = R.drawable.examples_home_mobile_vector3,
            nombreIcono = "Citas programadas"
        )
    }
}

@Composable
fun MiIconoConTexto(image:Int, nombreIcono:String){
    Column(modifier = Modifier
        .weight(1f)
        .padding(10.dp)
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(70.dp)
                .clip(CircleShape)
                .border(2.dp, MaterialTheme.colorScheme.primary, CircleShape)
                .background(MaterialTheme.colorScheme.background)
        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = nombreIcono,
                colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.primary)
            )
        }
        Text(text = nombreIcono,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .width(IntrinsicSize.Min)
            ,
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.labelSmall,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun ClienteCardRow(cliente: Cliente, modifier: Modifier) {
    Row(
        modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        ClienteAvatar(cliente = cliente)
        Column {
            Text(
                text = cliente.nombre,
                style = MaterialTheme.typography.bodyLarge
            )
            Text(cliente.especialidad)
            Calificacion(calificacion = 4)
        }
        Text(
            text = "Ver mas",
            color = MaterialTheme.colorScheme.primary
        )
        Image(
            painter = painterResource(id = R.drawable.usuario_home_user_3_vector),
            contentDescription = "Flecha siguiente",
            colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.primary)
        )
    }
}

@Composable
fun Calificacion(calificacion:Int){
    Row(modifier = Modifier.padding(5.dp)) {
        for(i:Int in 1..calificacion){
            Image(painter = painterResource(
                id = R.drawable.usuario_home_user_3_vector1),
                contentDescription = "Estrella",
                modifier = Modifier
                    .padding(1.dp)
                    .size(15.dp)
            )
        }
    }
}

@Composable
fun ClienteAvatar(cliente: Cliente) {
    val borderWidth = 1.dp
    Box() {
        Image(
            painter = painterResource(id = cliente.image),
            contentDescription = "ImagenCliente",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(75.dp)
                /*.blur(
                    radiusX = 2.dp,
                    radiusY = 2.dp,
                    edgeTreatment = BlurredEdgeTreatment.Unbounded
                )*/
                .border(
                    BorderStroke(borderWidth, MaterialTheme.colorScheme.primary),
                    CircleShape
                )
                .padding(borderWidth)
                .clip(CircleShape))
        Icon(
            imageVector = Icons.Filled.FavoriteBorder,
            contentDescription = "Check mark",
            modifier = Modifier
                .align(Alignment.TopEnd), tint = MaterialTheme.colorScheme.primary
        )
    }
}

@Preview
@Composable
fun MiprimerElementoPreview(){
    MiprimerElemento();
}

@Composable
fun MiprimerElemento(){
    Row {
        Column {
            Text(text = "Hola mundo")
            Text(text = "5464546541")
        }
        Text(text = "preview")
    }
}
