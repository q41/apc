/**
 */
package org.alia4j.language.textadventure.impl;

import java.util.Collection;

import org.alia4j.language.textadventure.Item;
import org.alia4j.language.textadventure.Person;
import org.alia4j.language.textadventure.TextadventurePackage;
import org.alia4j.language.textadventure.Tile;
import org.alia4j.language.textadventure.World;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>World</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.alia4j.language.textadventure.impl.WorldImpl#getItems <em>Items</em>}</li>
 *   <li>{@link org.alia4j.language.textadventure.impl.WorldImpl#getPersons <em>Persons</em>}</li>
 *   <li>{@link org.alia4j.language.textadventure.impl.WorldImpl#getTiles <em>Tiles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorldImpl extends EObjectImpl implements World
{
  /**
   * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItems()
   * @generated
   * @ordered
   */
  protected EList<Item> items;

  /**
   * The cached value of the '{@link #getPersons() <em>Persons</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersons()
   * @generated
   * @ordered
   */
  protected EList<Person> persons;

  /**
   * The cached value of the '{@link #getTiles() <em>Tiles</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTiles()
   * @generated
   * @ordered
   */
  protected EList<Tile> tiles;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorldImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TextadventurePackage.Literals.WORLD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Item> getItems()
  {
    if (items == null)
    {
      items = new EObjectContainmentEList<Item>(Item.class, this, TextadventurePackage.WORLD__ITEMS);
    }
    return items;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Person> getPersons()
  {
    if (persons == null)
    {
      persons = new EObjectContainmentEList<Person>(Person.class, this, TextadventurePackage.WORLD__PERSONS);
    }
    return persons;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Tile> getTiles()
  {
    if (tiles == null)
    {
      tiles = new EObjectContainmentEList<Tile>(Tile.class, this, TextadventurePackage.WORLD__TILES);
    }
    return tiles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TextadventurePackage.WORLD__ITEMS:
        return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
      case TextadventurePackage.WORLD__PERSONS:
        return ((InternalEList<?>)getPersons()).basicRemove(otherEnd, msgs);
      case TextadventurePackage.WORLD__TILES:
        return ((InternalEList<?>)getTiles()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TextadventurePackage.WORLD__ITEMS:
        return getItems();
      case TextadventurePackage.WORLD__PERSONS:
        return getPersons();
      case TextadventurePackage.WORLD__TILES:
        return getTiles();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TextadventurePackage.WORLD__ITEMS:
        getItems().clear();
        getItems().addAll((Collection<? extends Item>)newValue);
        return;
      case TextadventurePackage.WORLD__PERSONS:
        getPersons().clear();
        getPersons().addAll((Collection<? extends Person>)newValue);
        return;
      case TextadventurePackage.WORLD__TILES:
        getTiles().clear();
        getTiles().addAll((Collection<? extends Tile>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TextadventurePackage.WORLD__ITEMS:
        getItems().clear();
        return;
      case TextadventurePackage.WORLD__PERSONS:
        getPersons().clear();
        return;
      case TextadventurePackage.WORLD__TILES:
        getTiles().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TextadventurePackage.WORLD__ITEMS:
        return items != null && !items.isEmpty();
      case TextadventurePackage.WORLD__PERSONS:
        return persons != null && !persons.isEmpty();
      case TextadventurePackage.WORLD__TILES:
        return tiles != null && !tiles.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //WorldImpl
