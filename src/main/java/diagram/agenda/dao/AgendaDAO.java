package diagram.agenda.dao;

import diagram.agenda.entity.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*;



/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("AgendaDAO")
@Transactional(transactionManager="diagram.agenda-TransactionManager")
public interface AgendaDAO extends JpaRepository<Agenda, java.lang.String> {

  /**
   * Obtém a instância de Agenda utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Agenda entity WHERE entity.id = :id")
  public Agenda findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Agenda utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Agenda entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select a from Agenda a")
  public Page<Agenda> list ( Pageable pageable );
  







}