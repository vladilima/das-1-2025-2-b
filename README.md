# DESIGN E ARQUITETURA DE SOFTWARE I

## Abstração
É o ato de entender um problema real e representá-lo no código de forma simplificada, focando apenas nos aspectos essenciais para sua resolução. Isso permite transformar situações do mundo real em estruturas lógicas e funcionais dentro do software, facilitando a construção de sistemas mais claros. Softwares são abstrações de um problema do mundo real.

## Complexidade
Softwares tendem a ser complexos por esse motivo, e essa complexidade é um problema porque torna o sistema mais difícil de entender, manter e evoluir. Quanto mais complicado o código, mais difícil fica para os desenvolvedores entenderem como ele funciona, corrigirem erros, fazerem alterações com segurança e trabalharem em equipe.

## Frameworks
Frameworks são conjuntos que reúnem ferramentas, bibliotecas e regras pré-definidas, oferecendo uma base pronta para o desenvolvimento de software. Eles simplificam a criação de aplicações ao trazer soluções já desenvolvidas para problemas comuns. Geralmente, muitos frameworks são bastante similares entre si, por isso é importante se familiarizar com pelo menos um deles para ganhar produtividade, experiência e ter uma base que facilite a aprendizagem de outros, caso necessário.

## Padronização de código
Padronizar o código significa seguir convenções consistentes ao escrever o programa, variando conforme a linguagem utilizada. Isso inclui, por exemplo, adotar estilos uniformes para nomes de variáveis e funções, como camelCase (ex: minhaVariavel) ou snake_case (ex: minha_variavel). Essa prática melhora a legibilidade, facilita a compreensão e a manutenção do software, principalmente em equipes, pois cria um código mais claro e organizado para todos.

## Programação Orientada a Objetos (POO)
A orientação a objetos é um paradigma fundamental que organiza o código em classes e objetos, formando uma estrutura lógica e coerente para o desenvolvimento. Esse método permite encapsular informações, reutilizar trechos de código e dividir o sistema em módulos, o que torna mais fácil trabalhar em equipe, manter o sistema e ampliá-lo ao longo do tempo. O código fica mais estruturado, pois cada parte tem uma função bem definida.

## Estruturas de Dados
Estruturas de dados como listas, filas, árvores e grafos são essenciais para guardar, acessar e manipular informações de maneira eficiente. Elas formam a base para algoritmos rápidos e sistemas de alta performance. Árvores e grafos, por exemplo, são amplamente usados em grandes empresas como Google e Amazon para suportar aplicações que atendem milhões de usuários simultaneamente.

## Ocultação
A ocultação ocorre quando a implementação interna de uma função, classe ou módulo é escondida, permitindo que outras partes do sistema utilizem seus recursos sem precisar conhecer os detalhes do funcionamento interno. Isso ajuda a proteger o código e a manter a modularidade do sistema.

## Getters e Setters
Getters e setters são métodos usados para acessar e modificar os dados de uma classe de forma controlada. Eles fazem parte do conceito de encapsulamento e têm como objetivo proteger os dados internos, permitindo que sejam manipulados de maneira segura e adequada.

## Coesão
Coesão se refere ao grau em que os elementos dentro de uma classe ou método estão focados em uma única responsabilidade. Quando cada classe ou método realiza apenas uma tarefa específica, o código se torna mais organizado, fácil de entender e de manter. Usar a coesão com bom senso contribui para a clareza e qualidade do sistema.

## Acoplamento
Acoplamento é o nível de dependência entre diferentes partes de um sistema, como classes ou módulos. Um alto acoplamento indica que essas partes estão muito ligadas entre si, o que dificulta mudanças e manutenção. Já o baixo acoplamento significa que os componentes funcionam de forma mais independente, o que é desejável, pois facilita a reutilização, testes e evolução do software com menos impacto em outras áreas do código.