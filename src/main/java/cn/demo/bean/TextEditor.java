/**
 * 
 */
package cn.demo.bean;

/**
 * @author da0ke
 *
 *         日期:2018/03/31
 */
public class TextEditor {
	private SpellChecker spellChecker;


	public void spellCheck() {
		spellChecker.checkSpelling();
	}


	/**
	 * @param spellChecker the spellChecker to set
	 */
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
}
