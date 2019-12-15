## Alcoolmeter

## Paul Hauser // Lucas Gigondan // Gil Flassch--Trauth
https://github.com/popo-source/Alcoolmeter

# __Software Engineering__
# __Inhaltsverzeichnis__

## __Einleitung__
Im Rahmen einer Projektarbeit möchten wir Ihnen eine Blutalkohlgehalt-Software vorstellen, die wir mit Hilfe von Software-Engineering-Methoden im Team entwickelt haben. Ziel des Projektes war es, Methoden wie Scrum oder Agile praktisch anzuwenden und alle wichtigen Phasen der strukturierten Softwareentwicklung zu durchlaufen. Um dies zu erreichen, haben wir ein Blutalkohlgehaltdiagramm erstellt, das für jeden anpassbar ist. Der Zweck dieser Anwendung ist es, den Blutalkoholgehalt einer Person im Zeitverlauf zu berechnen.

* ### Ziele des Projekts:
Wir wollen eine Software entwickeln, die es dem Benutzer ermöglicht, seinen Blutalkoholgehalt im Laufe der Zeit zu berechnen. Er muss in der Möglichkeit sein, seine Charakteristika wie Nachname, Vorname, Geschlecht und Gewicht einzugeben.
Die Person hat die Möglichkeit, eine Liste von Alkohol und der aufgenommenen Menge zu erstellen. Der Benutzer muss angeben, ob er gegessen hat oder nicht.
Die Grafik muss an die verschiedenen Parameter angepasst werden.

* ### Randbedingungen:
Das Programm wird in der Programmiersprache Java erstellt.
Das Projektteam besteht aus drei Personen. 
Zur Programmierung wird Eclipse und Scene Builder verwendet.
Die Klassen des Programms sollen über die entsprechenden Unit-Tests verfügen.
Das Projekt soll auf GitHub veröffentlich werden.
Die Buildautomatisierung soll mit MAVEN erfolgen.
Das Programm soll mittels einer dafür erstellten JAR-Datei und dem Befehl java-jar xxxxx.jar ausgeführt werden können.

* ## __Build-Anleitung__

* ## __Bedienungsanleitung__
1. Öffnen Sie das Alkoholtest.
2. Klicken Sie auf „New" um Personen und Alkohole hinzuzufügen.
3. Füllen Sie die angezeigten Fenster aus und klicken Sie auf Ok. 
4. Klicken Sie auf „Add" um die konsumierten Alkohole und die Menge zu speichern.
5. Geben Sie die verbrauchte Alkoholmenge in das angezeigte Fenster ein und klicken Sie auf Ok.
6. Kreuzen Sie eines der beiden Kästchen "Yes" oder "No" an, um die Frage zu beantworten: „Have you eaten?“.
7. Zum Schluss klicken Sie auf „Graphic“. Sie erhalten ein Diagramm, das den Blutalkoholgehalt im Laufe der Zeit anzeigt.
8. Sie können immer eine Person, einen Alkohol oder den Alkoholkonsum einer Person jederzeit löschen, indem Sie die Zeile wählen und auf „Delete“ klicken.
9. Sie können die Informationen ändern, indem Sie die Zeile auswählen und auf „Edit" klicken.

* ## __Userstory mit Akzeptanzkriterien__

Us | Name | Beschreibung | SP | Priorität
-- | ---------------- | ------------------------------------------------------------------------------------------------ | -- | --
1 | Diagramminitializierung | Als Benutzer möchte ich meinen Alkoholgehalt im Blut als Funktion der Zeit kennenlernen. <br><b> Akezeptanzkriterien: <br></b>- Testen Sie die Funktion der Taste " Graphic ".<br></b>- Test zur Darstellung einer Grafik, die den Blutalkoholspiegel als Funktion der Zeit anzeigt.|  | 1 |
2  | Personanzeige | Als Benutzer möchte ich meinen Alkoholgehalt anhand meiner persönlichen Eigenschaften berechnen können. <br><b> Akezeptanzkriterien: <br></b>- Test, ob die Fensterbedienung zur Eingabe von Name, Vorname, Gewicht und Geschlecht einer Person fonctionniert. <br></b>- Test, um den Namen, Vornamen und das Gewicht der Person in einer Tabelle anzuzeigen.|  | 1 |
3  | Alkohlanzeige | Als Benutzer möchte ich in der Lage sein, eine vordefinierte Alkoholliste zu erstellen. <br><b> Akezeptanzkriterien: <br></b>- Test der Funktionsfähigkeit des Fensters, mit dem der Name des Alkohols und der Prozentsatz davon eingegeben werden können. <br></b>- Test zur Anzeige des Namens des Alkohols und des Alkoholanteils in einer Tabelle.|  | 1 |
4  | Mengenanzeige |Als Benutzer möchte ich meinen Alkoholgehalt basierend auf meinem Konsum verschiedener Alkohole berechnen können. <br><b> Akezeptanzkriterien: <br></b>- Funktionstest der Taste " Add ". <br></b>- Prüfung der Funktion des Fensters, die es ermöglicht, die Menge jedes aufgenommenen Alkohols einzugeben. <br></b>- Test zur Anzeige des Namens des Alkohols und der Menge in einer Tabelle. |  | 1 |
5  | Newanzeige | Als Benutzer möchte ich einige von mir eingegebene Variablen hinzufügen können. <br><b> Akezeptanzkriterien: <br></b>- Testen Sie die Funktion der Taste "New". <br></b>- Test der Fensterbedienung, die es ermöglicht, neue Personen oder neue Alkohole hinzuzufügen. |  | 3 |
6  | Editmethode | Als Benutzer möchte ich einige der von mir eingegebenen Variablen ändern können. <br><b> Akezeptanzkriterien: <br></b>- Testen Sie die Funktion der Taste "Edit". <br></b>- Testanzeige der Parameter der ausgewählten Zeile.|  | 2 |
7  | Deleteanzeige | Als Benutzer möchte ich einige der von mir eingegebenen Variablen löschen können. <br><b> Akezeptanzkriterien: <br></b>- Testen Sie die Funktion der Taste " Delete ". <br></b>- Testen Sie die Funktion des Fensters, damit Sie die Auswahl löschen können.|  | 3 |
8  | Fehlermeldunganzeige | Als Programmierer möchte ich, dass alle Informationen ausgewählt werden, bevor das Diagramm angezeigt wird.<br><b> Akezeptanzkriterien: <br></b>- Test der Anzeige der Fehlermeldung, wenn eine Auswahl fehlt.|  | 2 |
9  | Testmethode | Als Entwickler möchte ich ein einfach wartbares Programm damit alle Informatiker es bearbeiten können. <br><b> Akezeptanzkriterien: <br></b>- Test, ob die verschiedenen Klassen fonctionnieren.|  | 4 |


* ## __Releaseplan mit den Ausbaustufen__
* ## __Taskliste für die Umsetzung der User Story__

User Story 1 | Als Benutzer möchte ich meinen Alkoholgehalt im Blut als Funktion der Zeit kennenlernen. | 
Zeitaufwandschätzung |
-- | ---------------------------------------------------------------------------------- | -- 
| Task 1 | Erstellung der Taste " Graphic ". | 15 Minuten |
| Task 2 | Darstellung einer Grafik, die den Blutalkoholspiegel als Funktion der Zeit anzeigt.| 3 Stunde |

User Story 2  | Als Benutzer möchte ich meinen Alkoholgehalt anhand meiner persönlichen Eigenschaften berechnen können. | 
Zeitaufwandschätzung |
-- | ---------------------------------------------------------------------------------- | -- 
| Task 1 | Der Name, Vorname, Gewicht und Geschlecht einer Person müssen eingegeben werden können. | 30 Minuten | 
| Task 2 | Der Name, Vorname und das Gewicht der Person müssen in einer Tabelle angezeigt werden. | 1 Stunde |

User Story 3  | Als Benutzer möchte ich in der Lage sein, eine vordefinierte Alkoholliste zu erstellen. | 
Zeitaufwandschätzung |
-- | ---------------------------------------------------------------------------------- | -- 
| Task 1 | Der Name des Alkohols und der Prozentsatz davon müssen eingegeben werden können.| 30 Minuten |
| Task 2 | Der Name des Alkohols und der Alkoholanteils müssen in einer Tabelle angezeigt werden.| 1 Stunde |

User Story 4  | Als Benutzer möchte ich meinen Alkoholgehalt basierend auf meinem Konsum verschiedener Alkohole berechnen können. | 
Zeitaufwandschätzung |
-- | ---------------------------------------------------------------------------------- | -- 
| Task 1 | Erstellung der Taste " Add ". | 15 Minuten |
| Task 2 | Anzeige des Fensters, mit dem die Menge jedes aufgenommenen Alkohols eingegeben kann.| 1 Stunde |
| Task 3 | Der Name des Alkohols und die Menge müssen in einer Tabelle angezeigt werden. | 1 Stunde |

User Story 5  | Als Benutzer möchte ich einige von mir eingegebene Variablen hinzufügen können. | 
Zeitaufwandschätzung |
-- | ---------------------------------------------------------------------------------- | -- 
| Task 1 | Erstellung der Taste "Neu". | 15  Minuten |
| Task 2 | Anzeige des Fensters, mit dem neue Personen oder neue Alkohole hinzuzufügen können. | 1 Stunde |

User Story 6  | Als Benutzer möchte ich einige der von mir eingegebenen Variablen ändern können. | 
Zeitaufwandschätzung |
-- | ---------------------------------------------------------------------------------- | -- 
| Task 1 | Erstellung der Taste "Edit". | 15 Minuten |
| Task 2 | Anzeige des Fensters, mit dem die Auswahl ändern kann.| 1 Stunde |

User Story 7  | Als Benutzer möchte ich einige der von mir eingegebenen Variablen löschen können. | 
Zeitaufwandschätzung |
-- | ---------------------------------------------------------------------------------- | -- 
| Task 1 | Erstellung der Taste " Delete ". | 15 Minuten |
| Task 2 | Anzeige des Fensters, mit dem die Auswahl löschen kann.| 1 Stunde |

User Story 8  | Als Programmierer möchte ich, dass alle Informationen ausgewählt werden, bevor das Diagramm angezeigt wird. | 
Zeitaufwandschätzung |
-- | ---------------------------------------------------------------------------------- | -- 
| Task 1 | Anzeige einer Fehlermeldung.| 1 Stunde |

User Story 9  | Als Entwickler möchte ich ein einfach wartbares Programm damit alle Informatiker es bearbeiten können. | 
Zeitaufwandschätzung |
-- | ---------------------------------------------------------------------------------- | -- 
| Task 1 | Mehrere Klassen hinzufügen. | 1 Stunde |
| Task 2 | Logisches Design und liesbar.| 1 Stunde |

* ### __Tasklist__
Task | Zeitbedarf
------ | -------
Diagrammgleichung erstellen | 3 St
Startseite erstellen | 2 St
Personseite erstellen | 1 St
Alkohlseite erstellen | 1 St
Mengeseite erstellen | 1 St
Diagrammseite erstellen | 2 St
Design | 2 St
Testen | 3 St
   
* ## __Umsetzung__
* ## __Klassendiagramm__
* ## __Dokumentation wichtiger Code Snippets__
