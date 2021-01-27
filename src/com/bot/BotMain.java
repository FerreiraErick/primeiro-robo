package com.bot;

import java.util.ArrayList;
import java.util.List;

import com.bot.beans.BeanRobo;

import robocode.HitByBulletEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;

public class BotMain extends Robot {
    
    private List<BeanRobo> robosScaneados = new ArrayList<BeanRobo>();
//    private 

    public void run() {

	while (true) {
	    scan();
	}
    }
    
    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
	
	BeanRobo roboScaneado = new BeanRobo();
	roboScaneado.setBateria(event.getEnergy());
	roboScaneado.setNome(event.getName());
	roboScaneado.setDistancia(event.getDistance());
	roboScaneado.setAngulo(event.getBearing());
	
	robosScaneados.add(roboScaneado);
	
	if(roboScaneado.getDistancia() < 10) {
	    
	}
	
    }
    
    @Override
    public void onHitByBullet(HitByBulletEvent event) {
	
    }
}
