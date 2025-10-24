package com.example.advancelayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.advancelayout.ui.theme.AdvancelayoutTheme // pastikan nama sama seperti di Theme.kt

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AdvancelayoutTheme { // jangan pakai tanda kurung ()
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ActivitasPertama(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
