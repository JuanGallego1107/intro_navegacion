import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen() {
    Column {
        Spacer(modifier = Modifier.weight(1f))
        Text("LOGIN SCREEN", fontSize = 25.sp)
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = {}) {
            Text("NAVEGAR A HOME")
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}