# java-sebastian
<h1>📚 Descriere aplicație: <b>Biblioteca Virtuală</b></h1><br>
🎯 Funcționalitate principală:<br>
Utilizatorul își poate crea un cont și autentifica.
Odată autentificat, poate:
<ul>
  <li>Returna cărți (care îi aparțin)</li>
  <li>Este penalizat dacă returnează o carte după termenul limită (de ex: 14 zile)</li>
  <li>Împrumuta cărți (dacă sunt disponibile)</li>
</ul>
Un admin poate adăuga sau edita cărți.
<br><br>

<h2>📚 Lecția 1: Introducere în Java + Git & GitHub</h2>

<h3>Temă:</h3>
<ul>
  <li>Instalează Java și un IDE (ex: IntelliJ IDEA)</li>
  <li>Creează un proiect nou Java pentru aplicația "Biblioteca".</li>
  <li>Creează clasele: 
    <ul>
      <li><code>Carte</code>: cu atribute precum <code>titlu</code>, <code>autor</code>, <code>disponibila</code> (boolean)</li>
      <li><code>Utilizator</code>: cu atribute <code>nume</code>, <code>email</code>, <code>parola</code></li>
    </ul>
    Respectă principiile programării orientate pe obiect: atributele trebuie să fie <code>private</code> și accesate prin <code>getters</code> și <code>setters</code>.
  </li>
  <li>Creează un mic program în <code>Main</code> care creează 2-3 obiecte și le afișează.</li>
  <li>Fă commituri frecvente și dă push codului pe Git la final.</li>
</ul>

<h2>📚 Lecția 2: Moștenire, Abstractizare, Polimorfism & Layered Architecture</h2>

<h3>Temă:</h3>
<ul>
  <li>Creează interfața <code>IRepository&lt;T&gt;</code>, care definește metodele CRUD:
    <ul>
      <li><code>void save(T entity)</code></li>
      <li><code>void delete(T entity)</code></li>
      <li><code>T findById(int id)</code></li>
      <li><code>List&lt;T&gt; findAll()</code></li>
    </ul>
  </li>

  <li>Creează clasele <code>CarteRepository</code> și <code>UtilizatorRepository</code>, care implementează <code>IRepository&lt;T&gt;</code> și conțin:
    <ul>
      <li>O listă internă de obiecte (<code>List&lt;Carte&gt; carti</code>, <code>List&lt;Utilizator&gt; utilizatori</code>)</li>
      <li>Implementările complete ale metodelor din interfață</li>
    </ul>
  </li>

  <li>Creează clasa <code>UtilizatorService</code>, cu metode:
    <ul>
      <li><code>void register(Utilizator utilizator)</code> – adaugă un utilizator nou dacă nu există deja</li>
      <li><code>Utilizator login(String email, String parola)</code> – validează existența și parola utilizatorului</li>
    </ul>
  </li>

  <li>Creează clasa <code>CarteService</code>, cu metode:
    <ul>
      <li><code>void imprumuta(Utilizator utilizator, int idCarte)</code> – verifică dacă o carte este disponibilă și o asociază utilizatorului</li>
      <li><code>void returneaza(Utilizator utilizator, int idCarte, LocalDate dataReturnare)</code> – setează cartea ca fiind disponibilă și verifică dacă s-a depășit termenul de 14 zile, caz în care utilizatorul este penalizat (afișează un mesaj)</li>
    </ul>
  </li>

  <li>Simulează în <code>Main.java</code>:
    <ul>
      <li>Înregistrarea unui utilizator nou</li>
      <li>Autentificarea utilizatorului</li>
      <li>Împrumutul unei cărți</li>
      <li>Returnarea unei cărți după 15 zile și afișarea mesajului de penalizare</li>
    </ul>
  </li>

  <li>Fă commituri frecvente și dă push la final pe GitHub.</li>
</ul>
<h2>📚 Lecția 3: Baze de Date și JDBC</h2>

<h3>Temă:</h3>
<ul>
  <li>Creează baza de date <code>biblioteca</code> în MySQL și tabelele:
    <ul>
      <li><code>utilizatori</code> – cu coloane <code>id</code> (PK, AUTO_INCREMENT), <code>nume</code>, <code>email</code>, <code>parola</code></li>
      <li><code>carti</code> – cu coloane <code>id</code> (PK, AUTO_INCREMENT), <code>titlu</code>, <code>autor</code>, <code>disponibila</code> (BOOLEAN)</li>
    </ul>
  </li>

  <li>Creează clasele <code>JdbcCarteRepository</code> și <code>JdbcUtilizatorRepository</code>, care implementează <code>IRepository&lt;T&gt;</code> și folosesc JDBC pentru a accesa baza de date.</li>

  <li>Actualizează serviciile:
    <ul>
      <li><code>UtilizatorService</code> – să folosească <code>JdbcUtilizatorRepository</code></li>
      <li><code>CarteService</code> – să folosească <code>JdbcCarteRepository</code></li>
    </ul>
  </li>

  <li>Scrie teste JUnit pentru a valida metodele repository-urilor:
    <ul>
      <li><code>save()</code></li>
      <li><code>delete()</code></li>
      <li><code>findById()</code></li>
      <li><code>findAll()</code></li>
    </ul>
  </li>

  <li>Rulează aplicația și verifică:
    <ul>
      <li>Că utilizatorul se poate înregistra</li>
      <li>Că utilizatorul poate împrumuta și returna cărți</li>
      <li>Că datele sunt salvate corect în MySQL</li>
    </ul>
  </li>

  <li>Fă commituri frecvente și dă push la final pe GitHub.</li>
</ul>
<h2>📚 Lecția 4: Validări, Excepții, Logger (Log4j) și Criptarea Parolelor</h2>

<h3>Temă:</h3>
<ul>
  <li>Creează interfața generică <code>IValidator&lt;T&gt;</code> cu o metodă de validare.
  <ul><li><code>void validate(T entity) throws ValidationException</code></li></ul>
  </li>

  <li>Creează clasele de validare:
    <ul>
      <li><code>UtilizatorValidator</code> – verifică: numele nu este gol, email-ul respectă formatul standard, parola are cel puțin 6 caractere.</li>
      <li><code>CarteValidator</code> – verifică: titlul și autorul nu sunt goale.</li>
    </ul>
  </li>

  <li>Creează o clasă de excepție <code>ValidationException</code> pentru erori de validare.</li>

  <li>Modifică metodele din <code>UtilizatorService</code> și <code>CarteService</code> astfel încât:
    <ul>
      <li>Să folosească validatorii pentru a valida obiectele înainte de a le salva/folosi.</li>
      <li>Să arunce <code>ValidationException</code> dacă datele sunt invalide.</li>
    </ul>
  </li>

  <li>În <code>Main</code>, prinde excepțiile și afișează mesaje corespunzătoare.</li>

  <li>Adaugă în proiect suport pentru <b>Log4j 2</b>:
    <ul>
      <li>Creează un fișier de configurare <code>log4j2.xml</code> pentru loguri în consolă și fișier.</li>
      <li>În <code>UtilizatorService</code> și <code>CarteService</code> loghează evenimente:
        <ul>
          <li><b>INFO</b>: pentru evenimente normale (înregistrare reușită, împrumut carte).</li>
          <li><b>ERROR</b>: pentru date invalide (email greșit, carte indisponibilă).</li>
          <li><b>FATAL</b>: pentru erori neașteptate (de ex. conexiunea la baza de date pică).</li>
        </ul>
      </li>
    </ul>
  </li>

  <li>Creează clasa <code>PasswordUtils</code> cu metode pentru criptarea și decriptarea parolelor.</li>

  <li>Actualizează repository-urile și serviciile:
    <ul>
      <li>În <code>JdbcUtilizatorRepository</code>, criptează parola înainte să fie salvată în baza de date.</li>
      <li>În <code>UtilizatorService.login</code>, criptează parola introdusă și compar-o cu cea din baza de date.</li>
    </ul>
  </li>

  <li>Scrie un program de test în <code>Main</code> care să simuleze:
    <ul>
      <li>Înregistrarea unui utilizator cu email invalid → să apară <code>ValidationException</code> și să fie logată o eroare.</li>
      <li>Înregistrarea unui utilizator valid → parola trebuie salvată criptată, log INFO.</li>
      <li>Autentificarea unui utilizator → să funcționeze doar cu parola corectă.</li>
      <li>Autentificarea cu parolă greșită → mesaj de eroare în consolă.</li>
      <li>Împrumutarea unei cărți indisponibile → logger-ul să afișeze mesaj de tip ERROR.</li>
    </ul>
  </li>

  <li>Fă commituri frecvente și dă push la final pe GitHub.</li>
</ul>
<h2>📚 Lecția 5: Interfață Grafică cu JavaFX</h2> <h3>Temă:</h3> <ul> <li>Configurează JavaFX în proiectul tău (poți folosi modulul JavaFX din IDE sau Maven/Gradle).</li> <li>Creează o fereastră principală de **login**: <ul> <li>Două câmpuri: <b>Email</b> și <b>Parolă</b></li> <li>Două butoane: <b>Login</b> și <b>Înregistrare</b></li> <li>La apăsarea butonului <b>Înregistrare</b>, verifică datele cu <code>UtilizatorValidator</code> și salvează utilizatorul folosind <code>UtilizatorService</code></li> <li>La apăsarea butonului <b>Login</b>, verifică datele și, dacă sunt corecte, deschide o nouă fereastră</li> </ul> </li> <li>Creează o fereastră nouă care afișează lista de cărți disponibile în bibliotecă: <ul> <li>Folosind un <code>TableView</code> sau <code>ListView</code> pentru a lista titlul, autorul și disponibilitatea cărților</li> <li>Adaugă butoane pentru: <ul> <li><b>Împrumută cartea selectată</b> – folosește <code>CarteService.imprumuta()</code></li> <li><b>Returnează cartea selectată</b> – folosește <code>CarteService.returneaza()</code></li> </ul> </li> <li>Arată mesaje de succes sau eroare folosind <code>Alert</code> din JavaFX</li> </ul> </li> <li>Asigură-te că logica aplicației rămâne aceeași: <ul> <li>Validări și excepții sunt gestionate corect</li> <li>Parolele rămân criptate</li> <li>Evenimentele sunt logate corespunzător cu Log4j</li> </ul> <li>Simulează scenarii în aplicație: <ul> <li>Înregistrarea unui utilizator și login-ul său</li> <li>Vizualizarea cărților disponibile</li> <li>Împrumutarea și returnarea cărților</li> <li>Mesaje de alertă pentru erori (carte indisponibilă, date invalide)</li> </ul> </li> <li>Fă commituri frecvente și dă push la final pe GitHub.</li> </ul>
