/**
 */
package org.alia4j.language.textadventure;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.alia4j.language.textadventure.TextadventureFactory
 * @model kind="package"
 * @generated
 */
public interface TextadventurePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "textadventure";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.alia4j.org/alia4j-language-textadventure";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "textadventure";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TextadventurePackage eINSTANCE = org.alia4j.language.textadventure.impl.TextadventurePackageImpl.init();

  /**
   * The meta object id for the '{@link org.alia4j.language.textadventure.impl.WorldImpl <em>World</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.textadventure.impl.WorldImpl
   * @see org.alia4j.language.textadventure.impl.TextadventurePackageImpl#getWorld()
   * @generated
   */
  int WORLD = 0;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORLD__ITEMS = 0;

  /**
   * The feature id for the '<em><b>Persons</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORLD__PERSONS = 1;

  /**
   * The feature id for the '<em><b>Tiles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORLD__TILES = 2;

  /**
   * The number of structural features of the '<em>World</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORLD_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.alia4j.language.textadventure.impl.TileImpl <em>Tile</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.textadventure.impl.TileImpl
   * @see org.alia4j.language.textadventure.impl.TextadventurePackageImpl#getTile()
   * @generated
   */
  int TILE = 1;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TILE__X = 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TILE__Y = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TILE__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TILE__ID = 3;

  /**
   * The number of structural features of the '<em>Tile</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TILE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.alia4j.language.textadventure.impl.ItemImpl <em>Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.textadventure.impl.ItemImpl
   * @see org.alia4j.language.textadventure.impl.TextadventurePackageImpl#getItem()
   * @generated
   */
  int ITEM = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__NAME = 0;

  /**
   * The feature id for the '<em><b>Effects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__EFFECTS = 1;

  /**
   * The feature id for the '<em><b>Location</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__LOCATION = 2;

  /**
   * The number of structural features of the '<em>Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.alia4j.language.textadventure.impl.BindingImpl <em>Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.textadventure.impl.BindingImpl
   * @see org.alia4j.language.textadventure.impl.TextadventurePackageImpl#getBinding()
   * @generated
   */
  int BINDING = 3;

  /**
   * The feature id for the '<em><b>Participant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__PARTICIPANT = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__ID = 1;

  /**
   * The number of structural features of the '<em>Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.alia4j.language.textadventure.impl.EffectImpl <em>Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.textadventure.impl.EffectImpl
   * @see org.alia4j.language.textadventure.impl.TextadventurePackageImpl#getEffect()
   * @generated
   */
  int EFFECT = 4;

  /**
   * The feature id for the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT__CONDITION = 0;

  /**
   * The feature id for the '<em><b>Binding</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT__BINDING = 1;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT__ACTION = 2;

  /**
   * The number of structural features of the '<em>Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.alia4j.language.textadventure.impl.WhileEffectImpl <em>While Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.textadventure.impl.WhileEffectImpl
   * @see org.alia4j.language.textadventure.impl.TextadventurePackageImpl#getWhileEffect()
   * @generated
   */
  int WHILE_EFFECT = 5;

  /**
   * The feature id for the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_EFFECT__CONDITION = EFFECT__CONDITION;

  /**
   * The feature id for the '<em><b>Binding</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_EFFECT__BINDING = EFFECT__BINDING;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_EFFECT__ACTION = EFFECT__ACTION;

  /**
   * The number of structural features of the '<em>While Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_EFFECT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.textadventure.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.textadventure.impl.ActionImpl
   * @see org.alia4j.language.textadventure.impl.TextadventurePackageImpl#getAction()
   * @generated
   */
  int ACTION = 6;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.textadventure.impl.RemoveActionImpl <em>Remove Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.textadventure.impl.RemoveActionImpl
   * @see org.alia4j.language.textadventure.impl.TextadventurePackageImpl#getRemoveAction()
   * @generated
   */
  int REMOVE_ACTION = 7;

  /**
   * The feature id for the '<em><b>What</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOVE_ACTION__WHAT = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOVE_ACTION__FROM = ACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Remove Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOVE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.alia4j.language.textadventure.impl.ListImpl <em>List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.textadventure.impl.ListImpl
   * @see org.alia4j.language.textadventure.impl.TextadventurePackageImpl#getList()
   * @generated
   */
  int LIST = 8;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST__POSITION = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST__TARGET = 1;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST__PROPERTY = 2;

  /**
   * The number of structural features of the '<em>List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.alia4j.language.textadventure.impl.PersonImpl <em>Person</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.textadventure.impl.PersonImpl
   * @see org.alia4j.language.textadventure.impl.TextadventurePackageImpl#getPerson()
   * @generated
   */
  int PERSON = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__NAME = 0;

  /**
   * The feature id for the '<em><b>Abilities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__ABILITIES = 1;

  /**
   * The feature id for the '<em><b>Location</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__LOCATION = 2;

  /**
   * The number of structural features of the '<em>Person</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.alia4j.language.textadventure.impl.AbilityImpl <em>Ability</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.textadventure.impl.AbilityImpl
   * @see org.alia4j.language.textadventure.impl.TextadventurePackageImpl#getAbility()
   * @generated
   */
  int ABILITY = 10;

  /**
   * The number of structural features of the '<em>Ability</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABILITY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.textadventure.impl.IgnoreItemAbilityImpl <em>Ignore Item Ability</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.textadventure.impl.IgnoreItemAbilityImpl
   * @see org.alia4j.language.textadventure.impl.TextadventurePackageImpl#getIgnoreItemAbility()
   * @generated
   */
  int IGNORE_ITEM_ABILITY = 11;

  /**
   * The feature id for the '<em><b>Ignored Item</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IGNORE_ITEM_ABILITY__IGNORED_ITEM = ABILITY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ignore Item Ability</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IGNORE_ITEM_ABILITY_FEATURE_COUNT = ABILITY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.alia4j.language.textadventure.Condition <em>Condition</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.textadventure.Condition
   * @see org.alia4j.language.textadventure.impl.TextadventurePackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 12;

  /**
   * The meta object id for the '{@link org.alia4j.language.textadventure.Participant <em>Participant</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.textadventure.Participant
   * @see org.alia4j.language.textadventure.impl.TextadventurePackageImpl#getParticipant()
   * @generated
   */
  int PARTICIPANT = 13;

  /**
   * The meta object id for the '{@link org.alia4j.language.textadventure.Position <em>Position</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.textadventure.Position
   * @see org.alia4j.language.textadventure.impl.TextadventurePackageImpl#getPosition()
   * @generated
   */
  int POSITION = 14;

  /**
   * The meta object id for the '{@link org.alia4j.language.textadventure.Target <em>Target</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.textadventure.Target
   * @see org.alia4j.language.textadventure.impl.TextadventurePackageImpl#getTarget()
   * @generated
   */
  int TARGET = 15;

  /**
   * The meta object id for the '{@link org.alia4j.language.textadventure.Property <em>Property</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.textadventure.Property
   * @see org.alia4j.language.textadventure.impl.TextadventurePackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 16;


  /**
   * Returns the meta object for class '{@link org.alia4j.language.textadventure.World <em>World</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>World</em>'.
   * @see org.alia4j.language.textadventure.World
   * @generated
   */
  EClass getWorld();

  /**
   * Returns the meta object for the containment reference list '{@link org.alia4j.language.textadventure.World#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see org.alia4j.language.textadventure.World#getItems()
   * @see #getWorld()
   * @generated
   */
  EReference getWorld_Items();

  /**
   * Returns the meta object for the containment reference list '{@link org.alia4j.language.textadventure.World#getPersons <em>Persons</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Persons</em>'.
   * @see org.alia4j.language.textadventure.World#getPersons()
   * @see #getWorld()
   * @generated
   */
  EReference getWorld_Persons();

  /**
   * Returns the meta object for the containment reference list '{@link org.alia4j.language.textadventure.World#getTiles <em>Tiles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tiles</em>'.
   * @see org.alia4j.language.textadventure.World#getTiles()
   * @see #getWorld()
   * @generated
   */
  EReference getWorld_Tiles();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.textadventure.Tile <em>Tile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tile</em>'.
   * @see org.alia4j.language.textadventure.Tile
   * @generated
   */
  EClass getTile();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.textadventure.Tile#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.alia4j.language.textadventure.Tile#getX()
   * @see #getTile()
   * @generated
   */
  EAttribute getTile_X();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.textadventure.Tile#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.alia4j.language.textadventure.Tile#getY()
   * @see #getTile()
   * @generated
   */
  EAttribute getTile_Y();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.textadventure.Tile#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.alia4j.language.textadventure.Tile#getDescription()
   * @see #getTile()
   * @generated
   */
  EAttribute getTile_Description();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.textadventure.Tile#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.alia4j.language.textadventure.Tile#getId()
   * @see #getTile()
   * @generated
   */
  EAttribute getTile_Id();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.textadventure.Item <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item</em>'.
   * @see org.alia4j.language.textadventure.Item
   * @generated
   */
  EClass getItem();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.textadventure.Item#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.alia4j.language.textadventure.Item#getName()
   * @see #getItem()
   * @generated
   */
  EAttribute getItem_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.alia4j.language.textadventure.Item#getEffects <em>Effects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Effects</em>'.
   * @see org.alia4j.language.textadventure.Item#getEffects()
   * @see #getItem()
   * @generated
   */
  EReference getItem_Effects();

  /**
   * Returns the meta object for the reference '{@link org.alia4j.language.textadventure.Item#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Location</em>'.
   * @see org.alia4j.language.textadventure.Item#getLocation()
   * @see #getItem()
   * @generated
   */
  EReference getItem_Location();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.textadventure.Binding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binding</em>'.
   * @see org.alia4j.language.textadventure.Binding
   * @generated
   */
  EClass getBinding();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.textadventure.Binding#getParticipant <em>Participant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Participant</em>'.
   * @see org.alia4j.language.textadventure.Binding#getParticipant()
   * @see #getBinding()
   * @generated
   */
  EAttribute getBinding_Participant();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.textadventure.Binding#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.alia4j.language.textadventure.Binding#getId()
   * @see #getBinding()
   * @generated
   */
  EAttribute getBinding_Id();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.textadventure.Effect <em>Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Effect</em>'.
   * @see org.alia4j.language.textadventure.Effect
   * @generated
   */
  EClass getEffect();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.textadventure.Effect#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition</em>'.
   * @see org.alia4j.language.textadventure.Effect#getCondition()
   * @see #getEffect()
   * @generated
   */
  EAttribute getEffect_Condition();

  /**
   * Returns the meta object for the containment reference list '{@link org.alia4j.language.textadventure.Effect#getBinding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Binding</em>'.
   * @see org.alia4j.language.textadventure.Effect#getBinding()
   * @see #getEffect()
   * @generated
   */
  EReference getEffect_Binding();

  /**
   * Returns the meta object for the containment reference list '{@link org.alia4j.language.textadventure.Effect#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Action</em>'.
   * @see org.alia4j.language.textadventure.Effect#getAction()
   * @see #getEffect()
   * @generated
   */
  EReference getEffect_Action();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.textadventure.WhileEffect <em>While Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While Effect</em>'.
   * @see org.alia4j.language.textadventure.WhileEffect
   * @generated
   */
  EClass getWhileEffect();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.textadventure.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see org.alia4j.language.textadventure.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.textadventure.RemoveAction <em>Remove Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Remove Action</em>'.
   * @see org.alia4j.language.textadventure.RemoveAction
   * @generated
   */
  EClass getRemoveAction();

  /**
   * Returns the meta object for the reference '{@link org.alia4j.language.textadventure.RemoveAction#getWhat <em>What</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>What</em>'.
   * @see org.alia4j.language.textadventure.RemoveAction#getWhat()
   * @see #getRemoveAction()
   * @generated
   */
  EReference getRemoveAction_What();

  /**
   * Returns the meta object for the containment reference '{@link org.alia4j.language.textadventure.RemoveAction#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>From</em>'.
   * @see org.alia4j.language.textadventure.RemoveAction#getFrom()
   * @see #getRemoveAction()
   * @generated
   */
  EReference getRemoveAction_From();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.textadventure.List <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List</em>'.
   * @see org.alia4j.language.textadventure.List
   * @generated
   */
  EClass getList();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.textadventure.List#getPosition <em>Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Position</em>'.
   * @see org.alia4j.language.textadventure.List#getPosition()
   * @see #getList()
   * @generated
   */
  EAttribute getList_Position();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.textadventure.List#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target</em>'.
   * @see org.alia4j.language.textadventure.List#getTarget()
   * @see #getList()
   * @generated
   */
  EAttribute getList_Target();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.textadventure.List#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see org.alia4j.language.textadventure.List#getProperty()
   * @see #getList()
   * @generated
   */
  EAttribute getList_Property();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.textadventure.Person <em>Person</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Person</em>'.
   * @see org.alia4j.language.textadventure.Person
   * @generated
   */
  EClass getPerson();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.textadventure.Person#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.alia4j.language.textadventure.Person#getName()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.alia4j.language.textadventure.Person#getAbilities <em>Abilities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Abilities</em>'.
   * @see org.alia4j.language.textadventure.Person#getAbilities()
   * @see #getPerson()
   * @generated
   */
  EReference getPerson_Abilities();

  /**
   * Returns the meta object for the reference '{@link org.alia4j.language.textadventure.Person#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Location</em>'.
   * @see org.alia4j.language.textadventure.Person#getLocation()
   * @see #getPerson()
   * @generated
   */
  EReference getPerson_Location();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.textadventure.Ability <em>Ability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ability</em>'.
   * @see org.alia4j.language.textadventure.Ability
   * @generated
   */
  EClass getAbility();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.textadventure.IgnoreItemAbility <em>Ignore Item Ability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ignore Item Ability</em>'.
   * @see org.alia4j.language.textadventure.IgnoreItemAbility
   * @generated
   */
  EClass getIgnoreItemAbility();

  /**
   * Returns the meta object for the reference '{@link org.alia4j.language.textadventure.IgnoreItemAbility#getIgnoredItem <em>Ignored Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ignored Item</em>'.
   * @see org.alia4j.language.textadventure.IgnoreItemAbility#getIgnoredItem()
   * @see #getIgnoreItemAbility()
   * @generated
   */
  EReference getIgnoreItemAbility_IgnoredItem();

  /**
   * Returns the meta object for enum '{@link org.alia4j.language.textadventure.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Condition</em>'.
   * @see org.alia4j.language.textadventure.Condition
   * @generated
   */
  EEnum getCondition();

  /**
   * Returns the meta object for enum '{@link org.alia4j.language.textadventure.Participant <em>Participant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Participant</em>'.
   * @see org.alia4j.language.textadventure.Participant
   * @generated
   */
  EEnum getParticipant();

  /**
   * Returns the meta object for enum '{@link org.alia4j.language.textadventure.Position <em>Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Position</em>'.
   * @see org.alia4j.language.textadventure.Position
   * @generated
   */
  EEnum getPosition();

  /**
   * Returns the meta object for enum '{@link org.alia4j.language.textadventure.Target <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Target</em>'.
   * @see org.alia4j.language.textadventure.Target
   * @generated
   */
  EEnum getTarget();

  /**
   * Returns the meta object for enum '{@link org.alia4j.language.textadventure.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Property</em>'.
   * @see org.alia4j.language.textadventure.Property
   * @generated
   */
  EEnum getProperty();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TextadventureFactory getTextadventureFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.alia4j.language.textadventure.impl.WorldImpl <em>World</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.textadventure.impl.WorldImpl
     * @see org.alia4j.language.textadventure.impl.TextadventurePackageImpl#getWorld()
     * @generated
     */
    EClass WORLD = eINSTANCE.getWorld();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORLD__ITEMS = eINSTANCE.getWorld_Items();

    /**
     * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORLD__PERSONS = eINSTANCE.getWorld_Persons();

    /**
     * The meta object literal for the '<em><b>Tiles</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORLD__TILES = eINSTANCE.getWorld_Tiles();

    /**
     * The meta object literal for the '{@link org.alia4j.language.textadventure.impl.TileImpl <em>Tile</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.textadventure.impl.TileImpl
     * @see org.alia4j.language.textadventure.impl.TextadventurePackageImpl#getTile()
     * @generated
     */
    EClass TILE = eINSTANCE.getTile();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TILE__X = eINSTANCE.getTile_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TILE__Y = eINSTANCE.getTile_Y();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TILE__DESCRIPTION = eINSTANCE.getTile_Description();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TILE__ID = eINSTANCE.getTile_Id();

    /**
     * The meta object literal for the '{@link org.alia4j.language.textadventure.impl.ItemImpl <em>Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.textadventure.impl.ItemImpl
     * @see org.alia4j.language.textadventure.impl.TextadventurePackageImpl#getItem()
     * @generated
     */
    EClass ITEM = eINSTANCE.getItem();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITEM__NAME = eINSTANCE.getItem_Name();

    /**
     * The meta object literal for the '<em><b>Effects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITEM__EFFECTS = eINSTANCE.getItem_Effects();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITEM__LOCATION = eINSTANCE.getItem_Location();

    /**
     * The meta object literal for the '{@link org.alia4j.language.textadventure.impl.BindingImpl <em>Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.textadventure.impl.BindingImpl
     * @see org.alia4j.language.textadventure.impl.TextadventurePackageImpl#getBinding()
     * @generated
     */
    EClass BINDING = eINSTANCE.getBinding();

    /**
     * The meta object literal for the '<em><b>Participant</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINDING__PARTICIPANT = eINSTANCE.getBinding_Participant();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINDING__ID = eINSTANCE.getBinding_Id();

    /**
     * The meta object literal for the '{@link org.alia4j.language.textadventure.impl.EffectImpl <em>Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.textadventure.impl.EffectImpl
     * @see org.alia4j.language.textadventure.impl.TextadventurePackageImpl#getEffect()
     * @generated
     */
    EClass EFFECT = eINSTANCE.getEffect();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EFFECT__CONDITION = eINSTANCE.getEffect_Condition();

    /**
     * The meta object literal for the '<em><b>Binding</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EFFECT__BINDING = eINSTANCE.getEffect_Binding();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EFFECT__ACTION = eINSTANCE.getEffect_Action();

    /**
     * The meta object literal for the '{@link org.alia4j.language.textadventure.impl.WhileEffectImpl <em>While Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.textadventure.impl.WhileEffectImpl
     * @see org.alia4j.language.textadventure.impl.TextadventurePackageImpl#getWhileEffect()
     * @generated
     */
    EClass WHILE_EFFECT = eINSTANCE.getWhileEffect();

    /**
     * The meta object literal for the '{@link org.alia4j.language.textadventure.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.textadventure.impl.ActionImpl
     * @see org.alia4j.language.textadventure.impl.TextadventurePackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '{@link org.alia4j.language.textadventure.impl.RemoveActionImpl <em>Remove Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.textadventure.impl.RemoveActionImpl
     * @see org.alia4j.language.textadventure.impl.TextadventurePackageImpl#getRemoveAction()
     * @generated
     */
    EClass REMOVE_ACTION = eINSTANCE.getRemoveAction();

    /**
     * The meta object literal for the '<em><b>What</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REMOVE_ACTION__WHAT = eINSTANCE.getRemoveAction_What();

    /**
     * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REMOVE_ACTION__FROM = eINSTANCE.getRemoveAction_From();

    /**
     * The meta object literal for the '{@link org.alia4j.language.textadventure.impl.ListImpl <em>List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.textadventure.impl.ListImpl
     * @see org.alia4j.language.textadventure.impl.TextadventurePackageImpl#getList()
     * @generated
     */
    EClass LIST = eINSTANCE.getList();

    /**
     * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIST__POSITION = eINSTANCE.getList_Position();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIST__TARGET = eINSTANCE.getList_Target();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIST__PROPERTY = eINSTANCE.getList_Property();

    /**
     * The meta object literal for the '{@link org.alia4j.language.textadventure.impl.PersonImpl <em>Person</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.textadventure.impl.PersonImpl
     * @see org.alia4j.language.textadventure.impl.TextadventurePackageImpl#getPerson()
     * @generated
     */
    EClass PERSON = eINSTANCE.getPerson();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

    /**
     * The meta object literal for the '<em><b>Abilities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSON__ABILITIES = eINSTANCE.getPerson_Abilities();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSON__LOCATION = eINSTANCE.getPerson_Location();

    /**
     * The meta object literal for the '{@link org.alia4j.language.textadventure.impl.AbilityImpl <em>Ability</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.textadventure.impl.AbilityImpl
     * @see org.alia4j.language.textadventure.impl.TextadventurePackageImpl#getAbility()
     * @generated
     */
    EClass ABILITY = eINSTANCE.getAbility();

    /**
     * The meta object literal for the '{@link org.alia4j.language.textadventure.impl.IgnoreItemAbilityImpl <em>Ignore Item Ability</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.textadventure.impl.IgnoreItemAbilityImpl
     * @see org.alia4j.language.textadventure.impl.TextadventurePackageImpl#getIgnoreItemAbility()
     * @generated
     */
    EClass IGNORE_ITEM_ABILITY = eINSTANCE.getIgnoreItemAbility();

    /**
     * The meta object literal for the '<em><b>Ignored Item</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IGNORE_ITEM_ABILITY__IGNORED_ITEM = eINSTANCE.getIgnoreItemAbility_IgnoredItem();

    /**
     * The meta object literal for the '{@link org.alia4j.language.textadventure.Condition <em>Condition</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.textadventure.Condition
     * @see org.alia4j.language.textadventure.impl.TextadventurePackageImpl#getCondition()
     * @generated
     */
    EEnum CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '{@link org.alia4j.language.textadventure.Participant <em>Participant</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.textadventure.Participant
     * @see org.alia4j.language.textadventure.impl.TextadventurePackageImpl#getParticipant()
     * @generated
     */
    EEnum PARTICIPANT = eINSTANCE.getParticipant();

    /**
     * The meta object literal for the '{@link org.alia4j.language.textadventure.Position <em>Position</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.textadventure.Position
     * @see org.alia4j.language.textadventure.impl.TextadventurePackageImpl#getPosition()
     * @generated
     */
    EEnum POSITION = eINSTANCE.getPosition();

    /**
     * The meta object literal for the '{@link org.alia4j.language.textadventure.Target <em>Target</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.textadventure.Target
     * @see org.alia4j.language.textadventure.impl.TextadventurePackageImpl#getTarget()
     * @generated
     */
    EEnum TARGET = eINSTANCE.getTarget();

    /**
     * The meta object literal for the '{@link org.alia4j.language.textadventure.Property <em>Property</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.textadventure.Property
     * @see org.alia4j.language.textadventure.impl.TextadventurePackageImpl#getProperty()
     * @generated
     */
    EEnum PROPERTY = eINSTANCE.getProperty();

  }

} //TextadventurePackage
