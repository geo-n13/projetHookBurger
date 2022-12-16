# projetHookBurger
_Projet création d'un restaurant de Burgers_

## DESCRIPTION:
L'application réalisée a pour but de simuler et de voir les résultats d'une situation bien particulière.

Grâce à cette application, nous allons pouvoir constater une mise en situation réelle d'un restaurant de burger à travers plusieurs données utilisées :

- Prix des Burgers
- Création de Restaurants
- Initialisations de Tables, Serveurs, Cients, etc...
- Simulation du chiffre d'affaires
- etc...

## INSTALLATION ET DÉMARRAGE DU PROJET
###  Configuration : mise en place automatique des hooks
Vous devez vous assurer que vous utilisez la version 2.9 ou supérieur. Vous pouvez le vérifier depuis le terminal grâce à la commande "git --version".
Dans le cas contraire, veuillez le mettre à jour en tapant la commande suivante en fonction de votre système d'exploitation.

Windows :`git update-git-for-windows`

Macbook : `brew upgrade git`

Il faut ensuite mettre à jour les configurations afin que le git sache où se trouvent nos fichiers de crochet.
Pour ce faire, exécutez la commande suivante dans votre répertoire racine.

`git config core.hooksPath .githooks`

### Liste des crochets:
- commit-msg: Vérifie que le message de commit contient au moins 10 caracteres.
- pre-push: Vérifie que les tests passent avec succes avant de pousser la brancher sur Github

## CREDITS

**Geo Octavian MERCORE** _(g.mercore@epsi.fr)_

**Eliott BERNARD ()** _(eliott.bernard@cgi.fr)_

**Nicolas AMELAISE** _(nicolas.amelaise@epsi.fr)_

## LICENSE

[![License: MPL 2.0](https://img.shields.io/badge/License-MPL%202.0-brightgreen.svg)](https://opensource.org/licenses/MPL-2.0)
