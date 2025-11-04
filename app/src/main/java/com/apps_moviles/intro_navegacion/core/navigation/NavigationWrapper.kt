import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.apps_moviles.intro_navegacion.core.navigation.Home
import com.apps_moviles.intro_navegacion.core.navigation.Login

@Composable
fun NavigationWrapper() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Login) {
        composable<Login>{
            LoginScreen {navController.navigate(Home)}
        }
        composable<Home> {
            HomeScreen()
        }
    }
}