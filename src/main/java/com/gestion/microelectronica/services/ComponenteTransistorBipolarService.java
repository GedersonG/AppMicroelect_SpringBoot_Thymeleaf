package com.gestion.microelectronica.services;


import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.microelectronica.entities.ComponenteTransistorBipolarEntity;
import com.gestion.microelectronica.exceptions.capacitor.electrolitico.CapElectrNotFoundException;
import com.gestion.microelectronica.exceptions.transistor.bipolar.TransistorBipolarIdMismatchException;
import com.gestion.microelectronica.exceptions.transistor.bipolar.TransistorBipolarNotFoundException;
import com.gestion.microelectronica.repositories.I_ComponenteTransistorBipolarRepository;

@Service
public class ComponenteTransistorBipolarService {

	@Autowired
	private I_ComponenteTransistorBipolarRepository iTransistorBipolarRepository;

	// =============== LOGS ====================
		private static final Logger logger = org.apache.logging.log4j.LogManager
				.getLogger(ComponenteCapacitorElectroliticoService.class);

		// =============== MÉTODOS CRUD ====================

		// ==================
		// ===== INSERT =====
		// ==================
		public void addTransistorBipolar(ComponenteTransistorBipolarEntity transistorBipolar) {
			try {
				if (transistorBipolar == null) {
					logger.error("ERROR addTransistorBipolar : EL TRANSISTOR BIPOLAR " + transistorBipolar + " ES NULO!!");
					throw new CapElectrNotFoundException("EL TRANSISTOR BIPOLAR ES NULO");
				} else {
					iTransistorBipolarRepository.save(transistorBipolar);
					
				}

			} catch (Exception e) {
				logger.error("ERROR addTransistorBipolar : EL TRANSISTOR BIPOLAR " + transistorBipolar
						+ " NO SE HA INSERTADO EN LA DB!!");
				throw new TransistorBipolarNotFoundException("NO SE PUDO INSERTAR EL TRANSISTOR BIPOLAR ", e, false,
						true);
			}
		}

		// ==================
		// ===== UPDATE =====
		// ==================
		public void updateTransistorBipolar(ComponenteTransistorBipolarEntity transistorBipolar) {
			try {
				if (transistorBipolar == null) {
					logger.error("ERROR updateTransistorBipolar : EL TRANSISTOR BIPOLAR " + transistorBipolar + " ES NULO!!");
					throw new TransistorBipolarNotFoundException("EL TRANSISTOR BIPOLAR ES NULO");
				} else {
					iTransistorBipolarRepository.save(transistorBipolar);
					
				}

			} catch (Exception e) {
				logger.error("ERROR updateTransistorBipolar : EL TRANSISTOR BIPOLAR " + transistorBipolar
						+ " NO SE HA ACTUALIZADO EN LA DB!!");
				throw new TransistorBipolarNotFoundException("NO SE PUDO ACTUALIZAR EL TRANSISTOR BIPOLAR ", e, false,
						true);
			}
		}


		// ==================
		// ===== DELETE =====
		// ==================
		public void deleteTransistorBipolar(int id) {
			try {
				if (id <= 0 || iTransistorBipolarRepository.findById(id).getId() != id) {
					logger.error("ERROR deleteTransistorBipolar : EL CAPACITOR ELECTROLITICO CON EL " + id + " NO EXISTE!!");
					throw new TransistorBipolarIdMismatchException("EL ID NO EXISTE EN LA DB");
				} else {
					iTransistorBipolarRepository
							.delete(iTransistorBipolarRepository.findById(id));
					
				}

			} catch (Exception e) {
				logger.error("ERROR deleteTransistorBipolar : EL CAPACITOR ELECTROLITICO CON EL " + id + " NO SE HA ELIMINADO DE LA DB!!");
				throw new TransistorBipolarNotFoundException("NO SE PUDO ELIMINAR EL CAPACITOR ELECTROLITICO ", e, false,
						true);
			}
		}
}
