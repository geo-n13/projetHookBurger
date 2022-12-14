# projetHookBurger
Projet création d'un restaurant de burgers

## DESCRIPTION:
// TODO

## INSTALL AND RUN THE PROJECT
###  Configuration: Mise en place automatique des hooks

Vous devez vous assurez que vous utilisez la version 2.9 ou supérieur. Vous pouvez le vérifier depuis le terminal grâce à la commande "git --version".
Dans le cas contraire, veuillez le mettre à jour en tapant la commande suivante en fonction de votre systeme d'exploitation:
Windows: git update-git-for-windows
Mac: brew upgrade git


Il faut ensuite mettre à jour les configurations afin que le git sache où se trouvent nos fichiers de crochet.
Pour ce faire, exécutez la commande suivante dans votre répertoire racine.
git config core.hooksPath .githooks

### Liste des crochets:
- commit-msg: Vérifie que le message de commit contient au moins 10 caracteres.
- pre-push: Vérifie que les tests passent avec succes avant de pousser la brancher sur Github

## CREDITS
// TODO

## LICENSE
// TODO
