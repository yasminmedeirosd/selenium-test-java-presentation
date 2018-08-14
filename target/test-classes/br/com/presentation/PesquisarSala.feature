Feature: Validar pesquisa de Sala no Bate-Papo UOL


  Scenario Outline: Validar pesquisa de uma sala com nome válido.
    Given que estou na home do Bate-Papo UOL
    And eu digito "<sala>" no campo de pesquisa
    When eu clico no botão de pesquisar
    Then eu vejo a "<mensagem>" que a pesquisa foi feita
    And eu vejo o "<resultado>" da minha pesquisa
  Examples:
    | sala    | mensagem                                  | resultado           |
    | amizade | Resultados para o termo "amizade" em Sala | Amizade virtual (2) |

  Scenario Outline: Validar pesquisa de uma sala com nome inválido.
    Given que estou na home do Bate-Papo UOL
    And eu digito "<sala>" no campo de pesquisa
    When eu clico no botão de pesquisar
    Then eu vejo a "<mensagem>" que a pesquisa foi feita com termo inválido
    Examples:
      | sala       | mensagem                                                           |
      | amizade123 | Não foram encontrados resultados em Sala para o termo "amizade123" |