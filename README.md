Wir konnten alle Anforderungen einbauen und alle Queries sind als REST-Endpunkte verfügbar und mit JUnit und Postman getestet.

Die SQL Injection war zuerst schwieriger, da Spring Data/JPA dies natürlich verhindern will.
Auch der Entity Manager erlaubt keine Semikolone, deshalb wurde der Fehler "could not prepare statement" geworfen.
Dennoch konnten wir die SQL Injection einbauen, indem wir das Semikolon wegliessen.
Dadurch haben wir besser verstanden, auf was man bei SQL Injection achten muss.

Die Datengenerierung konnten wir sogar mit eigenen Kotlin Scripts lösen (im Kotlin Ordner).

Geschätzte Note: 5.75