## Alcoolmeter

## Paul Hauser // Lucas Gigondan // Gil Flassch--Trauth
https://github.com/popo-source/Alcoolmeter

# __Software Engineering__
# __Inhaltsverzeichnis__

## __Einleitung__
Unser Projekt ist ein Alkoholtest. Es wird verwendet, um den Blutalkoholspiegel einer Person basierend auf ihrem Gewicht, Geschlecht und Alkoholkonsum im Laufe der Zeit zu berechnen.
* ### Ziele:
Es soll ein kleines Programm erstellt werden, bei dem den Blutalkoholspiegel in einem Diagramm gezeigt werden. Die Verwendung des Programms soll auf dem Desktop eines MAC, Windows oder Linux Computer ausgeführt werden können.
* ### Randbedingungen:
Die Programmierung der Anwendung soll in JAVA erfolgen.
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

Us | Name |     | SP | Priorität
-- | ---------------- | ------------------------------------------------------------------------------------------------ | -- | --
1 |      | Als Benutzer möchte ich meinen Alkoholgehalt im Blut als Funktion der Zeit kennenlernen. <br><b> Akezeptanzkriterien: <br></b> Testen Sie die Funktion der Taste " Graphic ". Test zur Darstellung einer Grafik, die den Blutalkoholspiegel als Funktion der Zeit anzeigt.| 1 | 1 |
2  |      | Als Benutzer möchte ich meinen Alkoholgehalt anhand meiner persönlichen Eigenschaften berechnen können. <br><b> Akezeptanzkriterien: <br></b> Test, ob die Fensterbedienung zur Eingabe von Name, Vorname, Gewicht und Geschlecht einer Person fonctionniert. <br></b> Test, um den Namen, Vornamen und das Gewicht der Person in einer Tabelle anzuzeigen.| 1 | 1 |
3  |      | Als Benutzer möchte ich in der Lage sein, eine vordefinierte Alkoholliste zu erstellen. <br><b> Akezeptanzkriterien: <br></b> Test der Funktionsfähigkeit des Fensters, mit dem der Name des Alkohols und der Prozentsatz davon eingegeben werden können. <br></b> Test zur Anzeige des Namens des Alkohols und des Alkoholanteils in einer Tabelle.|  | 1 |
4  |      |Als Benutzer möchte ich meinen Alkoholgehalt basierend auf meinem Konsum verschiedener Alkohole berechnen können. <br><b> Akezeptanzkriterien: <br></b> Funktionstest der Taste " Add ". Prüfung der Funktion des Fensters, die es ermöglicht, die Menge jedes aufgenommenen Alkohols einzugeben. <br></b> Test zur Anzeige des Namens des Alkohols und der Menge in einer Tabelle. |  | 1 |
5  |      | Als Benutzer möchte ich einige von mir eingegebene Variablen hinzufügen können. <br><b> Akezeptanzkriterien: <br></b> Testen Sie die Funktion der Taste "Neu". <br></b> Test der Fensterbedienung, die es ermöglicht, neue Personen oder neue Alkohole hinzuzufügen. |  | 3 |
6  |      | Als Benutzer möchte ich einige der von mir eingegebenen Variablen ändern können. <br><b> Akezeptanzkriterien: <br></b> Testen Sie die Funktion der Taste "Edit". <br></b> Testanzeige der Parameter der ausgewählten Zeile.|  | 2 |
7  |      | Als Benutzer möchte ich einige der von mir eingegebenen Variablen löschen können. <br><b> Akezeptanzkriterien: <br></b> Testen Sie die Funktion der Taste " Delete ". <br></b> Testen Sie die Funktion des Fensters, damit Sie die Auswahl löschen können.|  | 3 |
8  |      | Als Programmierer möchte ich, dass alle Informationen ausgewählt werden, bevor das Diagramm angezeigt wird.<br><b> Akezeptanzkriterien: <br></b> Test der Anzeige der Fehlermeldung, wenn eine Auswahl fehlt.|  | 2 |
9  |      | Als Entwickler möchte ich ein einfach wartbares Programm damit alle Informatiker es bearbeiten können. <br><b> Akezeptanzkriterien: <br></b> Test, ob die verschiedenen Klassen fonctionnieren.|  | 4 |


* ## __Releaseplan mit den Ausbaustufen__
* ## __Taskliste für die Umsetzung der User Story__

User Story 1 | Als Benutzer möchte ich meinen Alkoholgehalt im Blut als Funktion der Zeit kennenlernen. | 
Zeitaufwandschätzung |
-- | ---------------------------------------------------------------------------------- | -- 
| Task 1 | Testen Sie die Funktion der Taste " Graphic ". | 1 Stunde |
| Task 2 | Test zur Darstellung einer Grafik, die den Blutalkoholspiegel als Funktion der Zeit anzeigt.| 1 Stunde |

User Story 2  | Als Benutzer möchte ich meinen Alkoholgehalt anhand meiner persönlichen Eigenschaften berechnen können. | 
Zeitaufwandschätzung |
-- | ---------------------------------------------------------------------------------- | -- 
| Task 1 | Test der Fensterbedienung zur Eingabe von Name, Vorname, Gewicht und Geschlecht einer Person. | 1 Stunde | 
| Task 2 | Test, um den Namen, Vornamen und das Gewicht der Person in einer Tabelle anzuzeigen. | 1 Stunde |

User Story 3  | Als Benutzer möchte ich in der Lage sein, eine vordefinierte Alkoholliste zu erstellen. | 
Zeitaufwandschätzung |
-- | ---------------------------------------------------------------------------------- | -- 
| Task 1 | Test der Funktionsfähigkeit des Fensters, mit dem der Name des Alkohols und der Prozentsatz davon eingegeben werden können.| 1 Stunde |
| Task 2 | Test zur Anzeige des Namens des Alkohols und des Alkoholanteils in einer Tabelle.| 1 Stunde |

User Story 4  | Als Benutzer möchte ich meinen Alkoholgehalt basierend auf meinem Konsum verschiedener Alkohole berechnen können. | 
Zeitaufwandschätzung |
-- | ---------------------------------------------------------------------------------- | -- 
| Task 1 | Funktionstest der Taste " Add ". | 1 Stunde |
| Task 2 | Prüfung der Funktion des Fensters, die es ermöglicht, die Menge jedes aufgenommenen Alkohols einzugeben.| 1 Stunde |
| Task 3 | Test zur Anzeige des Namens des Alkohols und der Menge in einer Tabelle. | 1 Stunde |

User Story 5  | Als Benutzer möchte ich einige von mir eingegebene Variablen hinzufügen können. | 
Zeitaufwandschätzung |
-- | ---------------------------------------------------------------------------------- | -- 
| Task 1 | Testen Sie die Funktion der Taste "Neu". | 1 Stunde |
| Task 2 | Test der Fensterbedienung, die es ermöglicht, neue Personen oder neue Alkohole hinzuzufügen. | 1 Stunde |

User Story 6  | Als Benutzer möchte ich einige der von mir eingegebenen Variablen ändern können. | 
Zeitaufwandschätzung |
-- | ---------------------------------------------------------------------------------- | -- 
| Task 1 | Testen Sie die Funktion der Taste "Edit". | 1 Stunde |
| Task 2 | Testanzeige der Parameter der ausgewählten Zeile.| 1 Stunde |

User Story 7  | Als Benutzer möchte ich einige der von mir eingegebenen Variablen löschen können. | 
Zeitaufwandschätzung |
-- | ---------------------------------------------------------------------------------- | -- 
| Task 1 | Testen Sie die Funktion der Taste " Delete ". | 1 Stunde |
| Task 2 | Testen Sie die Funktion des Fensters, damit Sie die Auswahl löschen können.| 1 Stunde |

User Story 8  | Als Programmierer möchte ich, dass alle Informationen ausgewählt werden, bevor das Diagramm angezeigt wird. | 
Zeitaufwandschätzung |
-- | ---------------------------------------------------------------------------------- | -- 
| Task 1 | Test der Anzeige der Fehlermeldung, wenn eine Auswahl fehlt.| 1 Stunde |

User Story 9  | Als Entwickler möchte ich ein einfach wartbares Programm damit alle Informatiker es bearbeiten können. | 
Zeitaufwandschätzung |
-- | ---------------------------------------------------------------------------------- | -- 
| Task 1 | Mehrere Klassen hinzufügen. | 1 Stunde |
| Task 2 | Logisches Design und liesbar.| 1 Stunde |

* ### __Tasklist__
Task | Zeitbedarf
------ | -------
 Notenberechnung | 1 Stunden
 Prüfmethode | 2 Stunden   
 Fenster erstellen | 3 Stunden
 Design | 2 Stunden
 Testen | 1 Stunden
   
* ## __Umsetzung__
* ## __Klassendiagramm__
* ## __Dokumentation wichtiger Code Snippets__
