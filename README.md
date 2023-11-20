# Template Method Design Pattern

## Definitie si explicatia pattern-ului
Design pattern-ul "Template method" este un pattern din categoria "behavioral patterns" care se bazeaza pe crearea unui sablon de urmat pentru alte obiecte, intr-o superclasa. Acest sablon presupune impartirea unui algoritm comun obiectelor in mai multe metode abstracte care sa fie folosite pe parcurs in interiorul subclaselor. Chiar daca toate metodele sunt folosite in subclase, unele dintre ele sunt optionale, fiind presupuse unor conditii.

## De ce folosim acest pattern? Si cum?
Pe parcursul aplicatiilor de multe ori ne confruntam cu initiera unor obiecte similare care impartasesc metode cu bucati de cod identice sau aproape identice. Tocmai din aceasta cauza, pattern-ul template method aduce in joc ideea de a scrie algoritmul care sta la baza unei metode intr-un mod divizat per pasi, ca mai apoi acestia sa fie pusi intr-o alta metoda principala superclasei (care nu poate fi suprascrisa in sublcase) din care toate obiectele principale vor prelua functionalitati.


In exemplul de mai sus din codul incarcat, am creat subclasele "BigFrame", "SmallFrame" si "OldSmallFrame" care extind superclasa "PictureFrame", in care avem prezenta metoda template asamblePictureFrame, care executa fiecare pas din algoritmul de "a pune o fotografie intr-o rama". Subclasele suprascriu toate metodele abstracte din superclasa, dar fiecare le foloseste potrivit functionalitatii lor (in BigFrame nu avem nevoie ca fotografia sa fie taiata, dar in small si old small da; in old small avem nevoie ca sticla sa fie curatatata, dar in big frame si small frame nu)

## De retinut:
- un "hook" este un pas optional care poate fi implementat, folosit pentru a extinde intr-un mod personalizat (vrei sa executi X sau nu) functionalitatea obiectului.
- toti pasii abstracti trebuie implementati de catre toate subclasele
- metoda principala din superclasa nu poate fi suprascrisa!

# Pros and Cons 
### Pros
- avem posibilitatea de a nu duplica cod
- este mai usor de intretinut in cazul unor schimbari ale algoritmului (care trebuie modificat doar in superclasa)

### Cons
- cresterea complexitatii programului, datorita impartirii algoritmului pe pasi si implementarea acestora in mai multe locuri in aplicatie, facandu-l mai greu de inteles la prima vedere, motiv pentru care documentatia joaca un rol crucial in aplicarea acestui pattern
- complexitatea aparuta in momentul in care apar conflicte intre nevoia de mostenire a claselor.
