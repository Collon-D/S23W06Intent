package kr.ac.kumoh.ce.s20190757.s23w06intent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat.startActivity
import kr.ac.kumoh.ce.s20190757.s23w06intent.ui.theme.S23W06IntentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            S23W06IntentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("안드로이드")
                }
            }
        }
    }
}
                // PascalCase로 만들어진다.
@Composable     // @ 다음 씌여진 것 : 어노테이션(Annotation)?
fun Greeting(name: String, modifier: Modifier = Modifier) {
        val context = LocalContext.current

        Column {
            Button(
                modifier = modifier.fillMaxWidth(),
                onClick = {
                    val uri = Uri.parse("https://www.youtube.com/watch?v=jOTfBlKSQYY")
                    val intent = Intent(Intent.ACTION_VIEW, uri)
                    startActivity(context, intent, null)
                }
            ) {
                Text(text = "YouTube")
            }
            Button(
                modifier = modifier.fillMaxWidth(),
                onClick = {
                    val uri = Uri.parse("https://www.youtube.com/watch?v=jOTfBlKSQYY")
                    val intent = Intent(Intent.ACTION_VIEW, uri)
                    startActivity(context, intent, null)
                }
            ) {
                Text(text = "Instagram")
            }
            Button(
                modifier = modifier.fillMaxWidth(),
                onClick = {
                    val uri = Uri.parse("geo:36.145014,128.393047?z=17")
                    val intent = Intent(Intent.ACTION_VIEW, uri)
                    startActivity(context, intent, null)
                }
            ) {
                Text(text = "Coorditaion")
            }
            Button(
                modifier = modifier.fillMaxWidth(),
                onClick = {
                    // val uri = Uri.parse("geo:0,0?q=경상남도 고성군 남해안대로 2746-52")
                    val uri = Uri.parse("geo:0,0?q=왕십리역")
                    val intent = Intent(Intent.ACTION_VIEW, uri)
                    startActivity(context, intent, null)
                }
            ) {
                Text(text = "Home")
            }
            Button(
                modifier = modifier.fillMaxWidth(),
                onClick = {
                    val uri = Uri.parse("tel:01012345678")
                    val intent = Intent(Intent.ACTION_VIEW, uri)
                    startActivity(context, intent, null)
                }
            ) {
                Text(text = "Calling")
            }
            Button(
                modifier = modifier.fillMaxWidth(),
                onClick = {
                    val uri = Uri.parse("sms:")
                    val intent = Intent(Intent.ACTION_VIEW, uri)
                    intent.putExtra("sms_body", "Please call me")
                    startActivity(context, intent, null)
                }
            ) {
                Text(text = "Message")
            }
        }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    S23W06IntentTheme {
        Greeting("Android")
    }
}