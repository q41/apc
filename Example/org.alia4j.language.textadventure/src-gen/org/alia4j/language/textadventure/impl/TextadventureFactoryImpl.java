/**
 */
package org.alia4j.language.textadventure.impl;

import org.alia4j.language.textadventure.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextadventureFactoryImpl extends EFactoryImpl implements TextadventureFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TextadventureFactory init()
  {
    try
    {
      TextadventureFactory theTextadventureFactory = (TextadventureFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.alia4j.org/alia4j-language-textadventure"); 
      if (theTextadventureFactory != null)
      {
        return theTextadventureFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TextadventureFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextadventureFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TextadventurePackage.WORLD: return createWorld();
      case TextadventurePackage.TILE: return createTile();
      case TextadventurePackage.ITEM: return createItem();
      case TextadventurePackage.BINDING: return createBinding();
      case TextadventurePackage.WHILE_EFFECT: return createWhileEffect();
      case TextadventurePackage.REMOVE_ACTION: return createRemoveAction();
      case TextadventurePackage.LIST: return createList();
      case TextadventurePackage.PERSON: return createPerson();
      case TextadventurePackage.IGNORE_ITEM_ABILITY: return createIgnoreItemAbility();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case TextadventurePackage.CONDITION:
        return createConditionFromString(eDataType, initialValue);
      case TextadventurePackage.PARTICIPANT:
        return createParticipantFromString(eDataType, initialValue);
      case TextadventurePackage.POSITION:
        return createPositionFromString(eDataType, initialValue);
      case TextadventurePackage.TARGET:
        return createTargetFromString(eDataType, initialValue);
      case TextadventurePackage.PROPERTY:
        return createPropertyFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case TextadventurePackage.CONDITION:
        return convertConditionToString(eDataType, instanceValue);
      case TextadventurePackage.PARTICIPANT:
        return convertParticipantToString(eDataType, instanceValue);
      case TextadventurePackage.POSITION:
        return convertPositionToString(eDataType, instanceValue);
      case TextadventurePackage.TARGET:
        return convertTargetToString(eDataType, instanceValue);
      case TextadventurePackage.PROPERTY:
        return convertPropertyToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public World createWorld()
  {
    WorldImpl world = new WorldImpl();
    return world;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tile createTile()
  {
    TileImpl tile = new TileImpl();
    return tile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Item createItem()
  {
    ItemImpl item = new ItemImpl();
    return item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding createBinding()
  {
    BindingImpl binding = new BindingImpl();
    return binding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhileEffect createWhileEffect()
  {
    WhileEffectImpl whileEffect = new WhileEffectImpl();
    return whileEffect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RemoveAction createRemoveAction()
  {
    RemoveActionImpl removeAction = new RemoveActionImpl();
    return removeAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List createList()
  {
    ListImpl list = new ListImpl();
    return list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Person createPerson()
  {
    PersonImpl person = new PersonImpl();
    return person;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IgnoreItemAbility createIgnoreItemAbility()
  {
    IgnoreItemAbilityImpl ignoreItemAbility = new IgnoreItemAbilityImpl();
    return ignoreItemAbility;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition createConditionFromString(EDataType eDataType, String initialValue)
  {
    Condition result = Condition.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertConditionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Participant createParticipantFromString(EDataType eDataType, String initialValue)
  {
    Participant result = Participant.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertParticipantToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Position createPositionFromString(EDataType eDataType, String initialValue)
  {
    Position result = Position.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPositionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Target createTargetFromString(EDataType eDataType, String initialValue)
  {
    Target result = Target.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTargetToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createPropertyFromString(EDataType eDataType, String initialValue)
  {
    Property result = Property.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPropertyToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextadventurePackage getTextadventurePackage()
  {
    return (TextadventurePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TextadventurePackage getPackage()
  {
    return TextadventurePackage.eINSTANCE;
  }

} //TextadventureFactoryImpl
