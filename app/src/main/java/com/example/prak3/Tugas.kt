package com.example.prak3


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Tugas() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier.fillMaxSize()) {


            Image(
                painter = painterResource(id = R.drawable.background),
                contentDescription = "Background",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )


            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 48.dp, bottom = 32.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {
                Text(
                    text = "Login",
                    color = Color.Blue,
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "Ini adalah halaman login,",
                    color = Color.White,
                    fontSize = 14.sp
                )

                Spacer(modifier = Modifier.height(32.dp))


                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Logo",
                    modifier = Modifier.size(150.dp),
                    contentScale = ContentScale.Fit
                )

                Spacer(modifier = Modifier.height(64.dp))

                Text(
                    text = "Nama",
                    color = Color.Red,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "Pascal Pahlevi Pasha",
                    color = Color.Blue,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "20000140001",
                    color = Color.Black,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(16.dp))


                Image(
                    painter = painterResource(id = R.drawable.foto),
                    contentDescription = "Foto",
                    modifier = Modifier
                        .fillMaxWidth(0.72f)
                        .aspectRatio(1f)
                        .clip(CircleShape)
                        .background(Color(0xFFE8E8F4))
                        .border(4.dp, Color.White, CircleShape),
                    contentScale = ContentScale.Fit
                )
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 411, heightDp = 891)
@Composable
fun TugasPreview() {
    Tugas()
}