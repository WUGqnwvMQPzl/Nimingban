/*
 * Copyright 2017 Hippo Seven
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hippo.nimingban.component

import android.os.Bundle
import android.support.annotation.CallSuper

/*
 * Created by Hippo on 6/19/2017.
 */

abstract class SceneLogic {

  /**
   * Destroy the logic.
   */
  internal fun destroy() {
    onDestroy()
  }

  /**
   * Save state of the logic.
   */
  internal fun saveState(outState: Bundle) {
    onSaveState(outState)
  }

  /**
   * Restore state of the logic.
   */
  internal fun restoreState(savedViewState: Bundle) {
    onRestoreState(savedViewState)
  }

  /**
   * Called when the logic destroyed.
   */
  @CallSuper
  protected open fun onDestroy() {}

  /**
   * Called when the logic state saved.
   */
  @CallSuper
  protected open fun onSaveState(outState: Bundle) {}

  /**
   * Called when the logic restored.
   */
  @CallSuper
  protected open fun onRestoreState(savedViewState: Bundle) {}
}