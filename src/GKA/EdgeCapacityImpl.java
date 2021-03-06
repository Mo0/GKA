package GKA;

import java.util.Arrays;

import Interfaces.CapacityEdge;

public class EdgeCapacityImpl implements CapacityEdge{

	private int[] id = new int[2];
	private Double value;
	
	public static CapacityEdge valueOf(int source, int target, Double value){
		return new EdgeCapacityImpl(source, target,value);
	}
	
	private EdgeCapacityImpl(int source, int target, Double value){
		this.id[0] = source;
		this.id[1] = target;
		this.value = value;
	}
		


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(id);
		long temp;
		temp = Double.doubleToLongBits(value);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EdgeCapacityImpl other = (EdgeCapacityImpl) obj;
		if (!Arrays.equals(id, other.getId()))
			return false;
		if (Double.doubleToLongBits(value) != Double
				.doubleToLongBits(other.getValue()))
			return false;
		return true;
	}

	public int[] getId(){
		return this.id;
	}
		
	public Double getValue(){
		return this.value;
	}
}
