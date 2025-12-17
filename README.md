# Natiivi-ohjelmointi Tehtävä 5: BMI-laskuri
⚖️ Android — BMI-laskuri Jetpack Compose -kirjastolla

**Oppilaitos:** Oulun ammattikorkeakoulu  
**Kurssi:** Natiivi-ohjelmointi IN00CT07-3009  
**Lukukausi:** Syksy 2025  

## 🧩 Tehtävän kuvaus
Tämän tehtävän tavoitteena oli toteuttaa yksinkertainen Android-sovellus, joka laskee käyttäjän painoindeksin (BMI). Sovellus demonstroi `ViewModel`-arkkitehtuurin käyttöä tilanhallinnassa ja datan käsittelyssä Jetpack Compose -ympäristössä.

Tehtävä toimii johdantona seuraaviin aiheisiin:
- Käyttäjän syötteiden käsittely Composessa
- `ViewModel`-komponentin hyödyntäminen tilan säilyttämisessä ja laskentalogiikassa
- Yksinkertaisen käyttöliittymän rakentaminen Compose-komponenteilla

## ✨ Toiminnallisuus
- **Syöttökentät:** Käyttöliittymässä on kaksi kenttää: pituuden syöttö metreinä (m) ja painon syöttö kilogrammoina (kg).
- **Reaaliaikainen laskenta:** Painoindeksi lasketaan ja päivitetään näytölle automaattisesti, kun käyttäjä muokkaa syötteitä.
- **Syötteen validointi:** Sovellus käsittelee pilkulla syötetyt desimaalit ja varmistaa, että laskentaa ei suoriteta virheellisillä arvoilla (esim. nolla tai tyhjä kenttä).

## 🛠️ Käytetyt teknologiat ja komponentit
- **Kieli:** Kotlin
- **IDE:** Android Studio
- **UI-kirjasto:** Jetpack Compose
- **Arkkitehtuuri:** MVVM (Model-View-ViewModel)
- **Material 3 -komponentit:** `Column`, `OutlinedTextField`, `Text`
- **State-hallinta:** `ViewModel`, `mutableStateOf`, `by delegates`
- **Syötteenhallinta:** `KeyboardOptions`

## 🎯 Oppimistavoitteet
- `ViewModel`-luokan käyttäminen datan ja tilan hallintaan.
- `mutableStateOf`-delegaatin hyödyntäminen Composable-funktioiden tilan päivityksessä.
- Käyttäjän syötteiden lukeminen ja käsittely `OutlinedTextField`-komponentilla.
- Peruslaskutoimitusten suorittaminen `ViewModelissä` ja tuloksen välittäminen käyttöliittymälle.
- Yksinkertaisen, yhden näytön Compose-sovelluksen rakentaminen.

## 📚 Oppimisresurssit
- **Jetpack Compose:**
  - [Virallinen Compose-dokumentaatio](https://developer.android.com/jetpack/compose)
  - [State in Compose](https://developer.android.com/jetpack/compose/state)
  - [TextField in Compose](https://developer.android.com/reference/kotlin/androidx/compose/material3/package-summary#OutlinedTextField(kotlin.String,kotlin.Function1,androidx.compose.ui.Modifier,kotlin.Boolean,kotlin.Boolean,androidx.compose.ui.text.TextStyle,kotlin.Function0,kotlin.Function0,kotlin.Function0,kotlin.Function0,androidx.compose.foundation.interaction.MutableInteractionSource,androidx.compose.ui.graphics.Shape,androidx.compose.material3.TextFieldColors,kotlin.Int,kotlin.Boolean))
- **ViewModel:**
  - [ViewModel Overview](https://developer.android.com/topic/libraries/architecture/viewmodel)
- **Kotlin:**
  - [Kotlin-kielen virallinen dokumentaatio](https://kotlinlang.org/docs/home.html)
