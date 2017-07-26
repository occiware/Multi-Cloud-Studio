package org.eclipse.cmf.occi.multicloud.vmware.connector.utils.allocator;

import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.crtp.Large;
import org.eclipse.cmf.occi.crtp.Medium;
import org.eclipse.cmf.occi.crtp.Mem_large;
import org.eclipse.cmf.occi.crtp.Mem_medium;
import org.eclipse.cmf.occi.crtp.Mem_small;
import org.eclipse.cmf.occi.crtp.Small;

public class ResourceTPLContainer {
	
	private Integer cores = 0;
	private Float mem = 0.0f;
	private Float ephemeralDiskSizeGB = 0.0f;
	
	private boolean small = false;
	private boolean medium = false;
	private boolean large = false;
	private boolean mem_small = false;
	private boolean mem_medium = false;
	private boolean mem_large = false;
	private boolean mixin = false;
	private MixinBase mixinResTpl;
	
	
	/**
	 * Build container from a mixin base CRTP - Resource template.
	 * @param mixinResourceTpl
	 */
	public ResourceTPLContainer(MixinBase mixinResourceTpl) {
	
		if (mixinResourceTpl != null) {
			this.mixin = true;
			this.mixinResTpl = mixinResourceTpl;
			// Determine extended interface from mixin base class.
			if (mixinResourceTpl instanceof Small) {
				cores = ((Small)mixinResourceTpl).getOcciComputeCores();
				mem = ((Small)mixinResourceTpl).getOcciComputeMemory();
				ephemeralDiskSizeGB = ((Small)mixinResourceTpl).getOcciComputeEphemeralStorageSize();
				this.small = true;
				return;
			}
			if (mixinResourceTpl instanceof Medium) {
				cores = ((Medium)mixinResourceTpl).getOcciComputeCores();
				mem = ((Medium)mixinResourceTpl).getOcciComputeMemory();
				ephemeralDiskSizeGB = ((Medium)mixinResourceTpl).getOcciComputeEphemeralStorageSize();
				this.medium = true;
				return;
			}
			if (mixinResourceTpl instanceof Large) {
				cores = ((Large)mixinResourceTpl).getOcciComputeCores();
				mem = ((Large)mixinResourceTpl).getOcciComputeMemory();
				ephemeralDiskSizeGB = ((Large)mixinResourceTpl).getOcciComputeEphemeralStorageSize();
				this.large = true;
				return;
			}
			if (mixinResourceTpl instanceof Mem_small) {
				cores = ((Mem_small)mixinResourceTpl).getOcciComputeCores();
				mem = ((Mem_small)mixinResourceTpl).getOcciComputeMemory();
				ephemeralDiskSizeGB = ((Mem_small)mixinResourceTpl).getOcciComputeEphemeralStorageSize();
				this.mem_small = true;
				return;
			}
			if (mixinResourceTpl instanceof Mem_medium) {
				cores = ((Mem_medium)mixinResourceTpl).getOcciComputeCores();
				mem = ((Mem_medium)mixinResourceTpl).getOcciComputeMemory();
				ephemeralDiskSizeGB = ((Mem_medium)mixinResourceTpl).getOcciComputeEphemeralStorageSize();
				this.mem_medium = true;
				return;
			}
			if (mixinResourceTpl instanceof Mem_large) {
				cores = ((Mem_large)mixinResourceTpl).getOcciComputeCores();
				mem = ((Mem_large)mixinResourceTpl).getOcciComputeMemory();
				ephemeralDiskSizeGB = ((Mem_large)mixinResourceTpl).getOcciComputeEphemeralStorageSize();
				this.mem_large = true;
				return;
			}
		}
	}
	
	public ResourceTPLContainer(Integer cores, Float mem, Float ephemeralDiskSizeGB) {
		if (cores == null) {
			cores = 1;
		}
		if (mem == null) {
			mem = 1.0f;
		}
		if (ephemeralDiskSizeGB == null) {
			ephemeralDiskSizeGB = 15.0f;
		}
		this.cores = cores;
		this.ephemeralDiskSizeGB = ephemeralDiskSizeGB;
		this.mem = mem;
	}
	
	
	/**
	 * @return the cores
	 */
	public Integer getCores() {
		return cores;
	}
	/**
	 * @param cores the cores to set
	 */
	public void setCores(Integer cores) {
		this.cores = cores;
	}
	/**
	 * @return the mem
	 */
	public Float getMem() {
		return mem;
	}
	/**
	 * @param mem the mem to set
	 */
	public void setMem(Float mem) {
		this.mem = mem;
	}
	/**
	 * @return the ephemeralDiskSizeGB
	 */
	public Float getEphemeralDiskSizeGB() {
		return ephemeralDiskSizeGB;
	}
	/**
	 * @param ephemeralDiskSizeGB the ephemeralDiskSizeGB to set
	 */
	public void setEphemeralDiskSizeGB(Float ephemeralDiskSizeGB) {
		if (ephemeralDiskSizeGB == null) {
			ephemeralDiskSizeGB = 0.0f;
		}
		
		this.ephemeralDiskSizeGB = ephemeralDiskSizeGB;
		if (isMixin()) {
			// Update the mixin aswell.
			if (isSmall()) {
				((Small) mixinResTpl).setOcciComputeEphemeralStorageSize(ephemeralDiskSizeGB);
			}
			if (isMedium()) {
				((Medium) mixinResTpl).setOcciComputeEphemeralStorageSize(ephemeralDiskSizeGB);
			}
			if (isLarge()) {
				((Large) mixinResTpl).setOcciComputeEphemeralStorageSize(ephemeralDiskSizeGB);
			}
			if (isMem_small()) {
				((Mem_small) mixinResTpl).setOcciComputeEphemeralStorageSize(ephemeralDiskSizeGB);
			}
			if (isMem_medium()) {
				((Mem_medium) mixinResTpl).setOcciComputeEphemeralStorageSize(ephemeralDiskSizeGB);
			}
			if (isMem_large()) {
				((Mem_large) mixinResTpl).setOcciComputeEphemeralStorageSize(ephemeralDiskSizeGB);
			}
		}
	}
	
	/**
	 * Convert ephemeral disk size GB to kilo bytes and convert Float type to Long type.
	 * @return
	 */
	public Long getEphemeralDiskSizeKB() {
		if (ephemeralDiskSizeGB == null) {
			ephemeralDiskSizeGB = 15.0f;
		}
		Long diskSizeGB = ephemeralDiskSizeGB.longValue();
		Long diskSizeKB = diskSizeGB * 1024 * 1024;
		return diskSizeKB;
	}
	
	/**
	 * Convert from Float mem GB to Long mem MB.
	 * @return
	 */
	public Long getMemoryMB() {
		if (mem == null) {
			mem = 0.0f;
		}
		Long memSizeGBLng = mem.longValue();
		Long memSizeMB = memSizeGBLng * 1024;
		return memSizeMB;
	}

	/**
	 * @return the small
	 */
	public boolean isSmall() {
		return small;
	}

	/**
	 * @return the medium
	 */
	public boolean isMedium() {
		return medium;
	}

	/**
	 * @return the large
	 */
	public boolean isLarge() {
		return large;
	}

	/**
	 * @return the mem_small
	 */
	public boolean isMem_small() {
		return mem_small;
	}

	/**
	 * @return the mem_medium
	 */
	public boolean isMem_medium() {
		return mem_medium;
	}

	/**
	 * @return the mem_large
	 */
	public boolean isMem_large() {
		return mem_large;
	}

	/**
	 * @return the mixin
	 */
	public boolean isMixin() {
		return mixin;
	}
	
	
	
}
