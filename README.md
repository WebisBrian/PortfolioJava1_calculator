Voici le contenu généré automatiquement pour ton `README.md`, prêt à être copié-collé dans un fichier `README.md` à la racine de ton projet :

---

````markdown
# 🧮 Calculatrice Java (Console)

![Java](https://img.shields.io/badge/Java-17+-orange?logo=java)
![License](https://img.shields.io/badge/license-MIT-blue)
![Status](https://img.shields.io/badge/status-learning-informational)

> Une petite application console Java permettant d'effectuer des opérations de calcul simples avec une architecture propre, évolutive et testable.

---

## ✨ Fonctionnalités

- ➕ Support des opérations `+`, `-`, `*`, `/`
- 🔁 Relancer un calcul automatiquement
- ⚠️ Gestion de la division par zéro
- ❌ Rejets des entrées invalides (lettres, caractères spéciaux, champs vides)
- ✅ Architecture modulaire, respectant les bonnes pratiques

---

## 🚀 Lancer l'application

### Pré-requis

- Java 17 ou version ultérieure
- IntelliJ IDEA (ou tout autre IDE Java)

### En console :

```bash
javac Main.java
java Main
````

---

## 📂 Structure

```
src/
├── Main.java               # Point d’entrée de l'application
├── CalculatorApp.java      # Logique applicative (interface console)
├── Calculator.java         # Exécution des calculs
├── InputHelper.java        # Gestion des entrées utilisateurs
└── OperationType.java      # Enumération des opérations (+, -, *, /)
```

---

## 📸 Exemple d'utilisation

```
Bonjour et bienvenue sur l'application de Calculatrice de Brian !
Renseignez le premier nombre: 10
Renseignez le second nombre: 5
Renseignez l'opération (+, -, *, /): /
10.0 / 5.0 = 2.0
Souhaitez-vous effectuer un autre calcul ? (o/n) n
```

---

## 🎯 Objectifs pédagogiques

* Appliquer les bonnes pratiques Java
* Travailler avec les `enum` comportementaux
* Gérer proprement les exceptions
* Structurer son code pour les tests unitaires (JUnit)
* Préparer un petit projet à présenter sur GitHub

---

## 🔭 À venir

* ✅ Couverture de tests unitaires avec **JUnit 5**
* 🧪 Tests d’intégration
* 📈 Ajout d’un historique des opérations

---

## 👨‍💻 Auteur

**Brian**
Développeur web en reconversion, passionné par le clean code et les projets utiles.
🎓 En formation Concepteur d'application Java (2025-2026)

---

## 📜 Licence

Ce projet est distribué sous licence MIT — libre à vous de l’utiliser, de le forker ou de l’améliorer.
