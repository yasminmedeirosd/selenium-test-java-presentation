Feature: Validar pesquisa de Sala no Bate-Papo UOL


  Scenario Outline: Validar pesquisa de uma sala com nome válido.
    Given que estou na home do Bate-Papo UOL
    And eu digito "<sala>" no campo de pesquisa
    When eu clico no botão de pesquisar
    Then eu vejo a "<mensagem>" que a pesquisa foi feita
    Examples:
      | sala    | mensagem                                  |
      | amizade | Resultados para o termo "amizade" em Sala |

  Scenario Outline: Validar pesquisa de uma sala com nome inválido.
    Given que estou na home do Bate-Papo UOL
    And eu digito "<sala>" no campo de pesquisa
    When eu clico no botão de pesquisar
    Then eu vejo a "<mensagem>" que a pesquisa foi feita com termo inválido
    Examples:
      | sala       | mensagem                                                                                 |
      | amizade123 | Verifique se a palavra foi escrita corretamente ou refaça a busca com outro termo. |