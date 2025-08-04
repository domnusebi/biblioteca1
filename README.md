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
