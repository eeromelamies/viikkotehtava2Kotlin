package domain.viikkotehtava1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import domain.viikkotehtava1.homeScreen.HomeScreen
import domain.viikkotehtava1.ui.theme.Viikkotehtava1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            Viikkotehtava1Theme {
                HomeScreen()
            }
        }
    }
}

