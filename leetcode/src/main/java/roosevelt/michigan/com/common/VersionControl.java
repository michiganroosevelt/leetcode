package roosevelt.michigan.com.common;

import java.util.Map;

/**
 * 
 * @author soup
 *
 */
public class VersionControl {

	private Map<Integer, Boolean> badVersions;

	public void setBadVersions(Map<Integer, Boolean> badVersions) {
		this.badVersions = badVersions;
	}

	public boolean isBadVersion(int version) {

		return badVersions.containsKey(version);
	}

}
