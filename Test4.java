package edu.javacourse;

import static org.junit.Assert.*;

import org.junit.Test;

//�������� ������ Test4
public class Test4 {

	@org.junit.Test
	public void test1() {
		
		// �������� ������� Calc � ��������� ����������
		Calc a = new Calc(1000, 45, 50);
		// ��������� �����������
		assertEquals(a.getCost(),"22500.0");
	}

}
