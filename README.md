# sudokusolver
Un fichier Sudoku à résoudre en entrée. Un fichier Sudoku résolu en sortie


Le but de ce projet est d'écrire un Sudoku ToSolve. Ce n'est pas guidé et vous devez choisir comment vous faites le développement par vous-même.
Les sudoku sont stockés dans des fichiers que vous devez lire. Il devrait être possible de donner le chemin du ou des fichiers à votre script. Une fois que votre algorithme a trouvé la solution, il doit l'écrire dans un fichier correspondant.
Avant de commencer, posez-vous quelques questions :
• Comment allez-vous stocker les informations sur le sudoku ?
• Comment allez-vous trouver la réponse possible pour chaque case du sudoku ?
• À quoi ressemblera votre algorithme global pour résoudre un sudoku ?
• Quelles fonctions et classes avez-vous besoin d'écrire ?
• Quels modules existants pouvez-vous utiliser ?
Le fichier grid.py contient quelques cas qui peuvent vous aider pour les tests.
Prime:
• Faire un générateur de sudoku.
• Permet à un utilisateur de jouer sur votre sudoku.
• Créez-lui une interface Web.
• En utilisant sqlalchemy, essayez de stocker le résultat de votre sudoku.
• Faites une partie d'échecs avec un IA pour cela.

grid = [[9, 4, 0, 3, 0, 0, 5, 7, 8], [6, 0, 0, 0, 4, 7, 1, 0, 0],
        [0, 2, 0, 0, 0, 1, 0, 0, 0], [0, 7, 0, 0, 0, 0, 0, 5, 1],
        [0, 0, 4, 0, 0, 0, 7, 0, 0], [3, 5, 0, 0, 0, 0, 0, 2, 0],
        [0, 0, 0, 8, 0, 0, 0, 3, 0], [0, 0, 5, 4, 2, 0, 0, 0, 9],
        [2, 3, 8, 0, 0, 9, 0, 4, 7]]

grid = [[9, 4, 1, 3, 6, 2, 5, 7, 8], [6, 8, 3, 5, 4, 7, 1, 9, 2], [5, 2, 7, 9, 8, 1, 4 ,6, 3],
        [8, 7, 2, 6, 9, 4, 3, 5, 1], [1, 9, 4, 2, 3, 5, 7, 8, 6], [3, 5, 6, 7, 1, 8, 9, 2, 4],
        [4, 1, 9, 8, 7, 6, 2, 3, 5], [7, 6, 5, 4, 2, 3, 8, 1, 9], [2, 3, 8, 1, 5, 9, 6, 4, 7]]

grid = [[1,2,3,4,5,6,7,8,9], [1,2,3,4,5,6,7,8,9], [1,2,3,4,5,6,7,8,9],
    [1,2,3,4,5,6,7,8,9], [1,2,3,4,5,6,7,8,9], [1,2,3,4,5,6,7,8,9]
    [1,2,3,4,5,6,7,8], [1,2,3,4,5,6,7,8,9], [1,2,3,4,5,6,7,8,9]]

grid = [[1,2,3,4,5,6,7,8, 9],[],[],[],[],[],[],[],[]]

grid = [[0, 6, 0, 0, 0, 0, 2, 8, 0], [0, 0, 0, 6, 2, 1, 4, 3, 7], [0, 3, 0, 0, 8, 0, 0, 0, 9],
        [3, 8, 0, 0, 6, 0, 9, 1, 2], [2, 1, 0, 5, 0, 8, 6, 7, 4], [7, 0, 6, 0, 0, 9, 0, 0, 8],
        [8, 2, 4, 0, 0, 3, 0, 0, 6], [0, 7, 0, 0, 4, 0, 0, 2, 5], [0, 0, 0, 9, 0, 2, 0, 0, 0]]
