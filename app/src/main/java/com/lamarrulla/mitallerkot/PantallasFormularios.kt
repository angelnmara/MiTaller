package com.lamarrulla.mitallerkot

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

data class TextTipo(val titulo:String,
                    val value:String,
                    val tipo:KeyboardType)

data class ComponenteDatos(
    val titulo:String,
    val subTitulo:String,
    val textTipoArray: List<TextTipo>
)

val pantallaDatosPersonales = ComponenteDatos(
    titulo = "Nuevo Cliente",
    subTitulo = "Datos Personales",
    textTipoArray = listOf(
        TextTipo("Nombre", "", KeyboardType.Text),
        TextTipo("Apellido paterno", "", KeyboardType.Text),
        TextTipo("Apellido materno", "", KeyboardType.Text)
    )
)

val pantallaDatosdeContacto = ComponenteDatos(
    titulo = "Nuevo Cliente",
    subTitulo = "Datos Personales",
    textTipoArray = listOf(
        TextTipo("Correo", "", KeyboardType.Email),
        TextTipo("Telefono Celular", "", KeyboardType.Phone),
        TextTipo("Telefono Fijo", "", KeyboardType.Phone)
    )
)

val pantallaDatosDomicilio = ComponenteDatos(
    titulo = "Nuevo Cliente",
    subTitulo = "Datos Domicilio",
    textTipoArray = listOf(
        TextTipo("Pais", "", KeyboardType.Email),
        TextTipo("Codigo postal", "", KeyboardType.Phone),
        TextTipo("Estado", "", KeyboardType.Phone),
        TextTipo("Municipio", "", KeyboardType.Phone),
        TextTipo("Calle", "", KeyboardType.Phone),
        TextTipo("Numero interior", "", KeyboardType.Phone),
        TextTipo("Numero exterior", "", KeyboardType.Phone)
    )
)

@Preview
// [START android_compose_components_centeralignedtopappbar]
@Composable
fun FormularioDinamico(){
    CenterAlignedTopAppBarExample(pantallaDatosPersonales)
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CenterAlignedTopAppBarExample(componenteDatos: ComponenteDatos) {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())

    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),

        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text(
                        componenteDatos.titulo,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                navigationIcon = {
                    androidx.compose.material3.IconButton(onClick = { /* do something */ }) {
                        androidx.compose.material3.Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Localized description"
                        )
                    }
                },
                actions = {
                    androidx.compose.material3.IconButton(onClick = { /* do something */ }) {
                        androidx.compose.material3.Icon(
                            imageVector = Icons.Filled.Menu,
                            contentDescription = "Localized description"
                        )
                    }
                },
                scrollBehavior = scrollBehavior,
            )
        }
    ){
            innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)){
            ComponenteDatosContacto(componenteDatos)
        }
    }
}

@Composable
fun ComponenteDatosContacto(componenteDatos: ComponenteDatos){
    Column(Modifier.padding(10.dp), verticalArrangement = Arrangement.spacedBy(10.dp)){
        Column {
            HorizontalDivider()
            Text(text = componenteDatos.subTitulo)
        }
        for (textTipo in componenteDatos.textTipoArray.iterator()){
            var value by remember { mutableStateOf(textTipo.value) }
            TextField(
                keyboardOptions = KeyboardOptions(keyboardType = textTipo.tipo),
                modifier = Modifier.fillMaxWidth(),
                value = value,
                onValueChange = { value = it },
                label = { Text(textTipo.titulo) }
            )
        }
    }
}