package com.example.calmstate

import com.example.calmstate.getStartedScreen.GetStartedPage
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.calmstate.homePage.HomePage
import com.example.calmstate.ui.theme.CalmStateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalmStateTheme {
                    //NavController
                    val navController = rememberNavController()
                    //NavHost
                    NavHost(navController = navController, startDestination = "getstarted") {
                        //NavGraph
                        composable("getstarted"){
                            GetStartedPage(navController = navController)
                        }
                        composable("homepage"){
                            HomePage(navController = navController)
                        }
                    }
            }
        }
    }
}


//@Preview
//@Composable
//fun GetStartedPagePreview() {
//    GetStartedPage()
//}