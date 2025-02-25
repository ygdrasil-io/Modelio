/* 
 * Copyright 2013-2020 Modeliosoft
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package org.modelio.api.modelio.model.event;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * This interface provide the API of a Model Move Event
 */
@objid ("01f413bc-0000-009d-0000-000000000000")
public interface IElementMovedEvent {
    @objid ("01f413bc-0000-0115-0000-000000000000")
    @Override
    String toString();

    /**
     * Used to get the moved element.
     * @return Returns the moved element
     */
    @objid ("a41ee09d-0ecc-11e2-96c4-002564c97630")
    MObject getMovedElement();

    /**
     * Used to get the new moved element parent.
     * <p><p>
     * The parent corresponds to the element accessed through the use of the
     * {@link MObject#mGetCompositionOwner()} method.
     * @return Returns the new parent of the moved element
     */
    @objid ("a41ee0a0-0ecc-11e2-96c4-002564c97630")
    MObject getNewParent();

    /**
     * Used to get the old moved element parent.
     * <p><p>
     * The parent corresponds to the element accessed through the use of the
     * {@link MObject#mGetCompositionOwner()} method.
     * @return Returns the old parent of the moved element
     */
    @objid ("a41f07af-0ecc-11e2-96c4-002564c97630")
    MObject getOldParent();
}

