# Viikkotehtava2Kotlin

**Viikkotehtava2Kotlin** on Kotlinilla ja Jetpack Composella toteutettu tehtävälista-sovellus
---

## Ominaisuudet

- Lisää tehtäviä: Kirjoita tehtävän nimi ja lisää se listaan.
- Tehtävien hallinta: Merkitse tehtäviä tehdyksi checkboxilla tai poista ne kokonaan.
- Suodatus: Voit näyttää joko kaikki tehtävät tai suodattaa näkyviin vain tekemättömät tehtävät.
- Lajittelu: Järjestä tehtävät joko ID:n tai eräpäivän mukaan.
- Dynaaminen tila: Sovellus käyttää Composen mutableStateOf -tilaa, joten käyttöliittymä päivittyy välittömästi tietojen muuttuessa.

---

## Arkkitehtuuri

- domain: Sisältää tietomallit (Task) ja esimerkkidatan. 
- viewModel: TaskViewModel vastaa sovelluslogiikasta, tilan hallinnasta ja tietojen suodattamisesta. 
- homeScreen: Sisältää käyttöliittymäkomponentit (Jetpack Compose).
- MainActivity: Sovelluksen aloituspiste, joka alustaa teeman ja kutsuu päänäkymää.

---

## Teknologiat

- Kieli: Kotlin
- UI-kehys: Jetpack Compose
- Arkkitehtuuri: ViewModel & State Management
- Komponentit: Material3 (TextField, Button, Checkbox, LazyColumn)

---

## Asennus

- Kloonaa repo:
- bash: git clone <repo_url>
- Avaa projekti Android Studiossa
- Rakenna ja suorita sovellus emulatorissa tai laitteessa
