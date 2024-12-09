# Algoritmusok és adatszerkezetek gyakorlat házi feladat
## Makszim Balázs Imre ENSGO3
## Candies
Feladat eredeti leírása:
https://www.hackerrank.com/challenges/candies/problem

Magyar leírás:

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