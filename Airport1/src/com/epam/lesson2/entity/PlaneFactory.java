package com.epam.lesson2.entity;

public class PlaneFactory {
public static Plane buildPlane(PlaneType  type ){
	Plane plane=null;
	switch(type){
	case BOEING_747_200:
		plane=new Airliner(type.getName(),type.getFuel(),type.getRange(),
				type.getStaffSeating(),type.getSeatingCapacity());
		break;
		case BOEING_767_200:
		plane=new Airliner(type.getName(),type.getFuel(),type.getRange(),
				type.getStaffSeating(),type.getSeatingCapacity());
		break;
	case T”_154_¡:
		plane=new Airliner(type.getName(),type.getFuel(),type.getRange(),
				type.getStaffSeating(),type.getSeatingCapacity());
		break;
	case AIRBUS_A_310:
		plane=new Airliner(type.getName(),type.getFuel(),type.getRange(),
				type.getStaffSeating(),type.getSeatingCapacity());
		break;
	case ¿Õ_225:
		plane=new Freighter(type.getName(),type.getFuel(),type.getRange(),
			type.getStaffSeating(),type.getCarryingCapacity());
		break;
	case	AH_124:
		plane=new Freighter(type.getName(),type.getFuel(),type.getRange(),
				type.getStaffSeating(),type.getCarryingCapacity());
			break;
	}
	return plane;
	
}
}
