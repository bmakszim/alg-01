# Algoritmusok és adatszerkezetek gyakorlat házi feladat
## Makszim Balázs Imre ENSGO3

Feladat eredeti leírása:
https://www.hackerrank.com/challenges/candies/problem

## Feladat: Cukorkák osztása

Alice óvodai tanár. Szeretne cukorkát adni az osztályában lévő gyerekeknek. Minden gyerek sorban ül, és mindegyiküknek van egy pontszáma, amely az osztályban nyújtott teljesítményüket jelzi. Alice szeretne legalább 1 cukorkát adni minden gyereknek. Ha két gyerek egymás mellett ül, akkor annak, akinek magasabb a pontszáma, több cukorkát kell kapnia. Alice célja, hogy minimalizálja a megvásárolandó cukorkák számát.

## Példa

Alice a gyerekeknek a következő minimális mennyiségű cukorkát adja: **[1, 2, 1]**. Összesen minimum **4 cukorkát** kell vásárolnia.

## Funkció leírása
Egészítsd ki a **candies** nevű függvényt az alábbiak szerint:

### Paraméterek:
- **int n**: a gyerekek száma az osztályban.
- **List<Integer> arr**: a gyerekek pontszáma.

### Visszatérési érték:
- **long**: a minimálisan szükséges cukorkák száma.

## Bemeneti formátum:
1. Az első sor tartalmaz egy egész számot, **n**-t, amely a gyerekek számát jelöli.  
2. A következő **n** sor mindegyike tartalmaz egy egész számot, amely a gyerekek adott helyen lévő pontszámát jelzi.

## Megoldás

Az ***src/main*** könyvtár tartalmazza a megoldás forráskódját. Az ***src/test*** pedig a teszteseteket.

## Megoldó algoritmus

1. Inicializálás:
Minden gyerek kap 1 cukorkát kezdetben, mert mindenkinek legalább egyet kell kapnia.

2. Bejárás előről:
Haladjunk balról jobbra.
Ha az aktuális gyerek pontszáma magasabb, mint az előző gyereké, akkor egy cukorkával többet kap, mint az előző.

3. Bejárás visszafelé:
Haladjunk jobbról balra.
Ha az aktuális gyerek pontszáma magasabb, mint a következő gyereké, biztosítsuk, hogy több cukorkát kapjon, mint a következő, a cukorkaszám frissítésével.

4. Összes cukorka:
Adjuk össze a cukorkák számát, hogy megkapjuk a szükséges minimális cukorkák számát.