@echo off
java -version:1.7 -cp ./bin;.\lib\epsilon-standalone-pro.jar;.\lib\org.eclipse.core.resources.win32.x86_3.5.100.v20100505-1741.jar;.\lib\org.eclipse.core.resources_3.8.100.v20130521-2026.jar;.\lib\org.eclipse.core.runtime_3.9.0.v20130326-1255.jar;.\lib\org.eclipse.emf.common_2.9.2.v20131212-0545.jar;.\lib\org.eclipse.emf.ecore.xmi_2.9.1.v20131212-0545.jar;.\lib\org.eclipse.emf.ecore_2.9.2.v20131212-0545.jar;.\lib\epsilon-1.1_SR1-emf-src.jar co.edu.uniandes.fixml.FixmlToObjectOriented %1 