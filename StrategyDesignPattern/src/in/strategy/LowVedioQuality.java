package in.strategy;

public class LowVedioQuality implements VedioQuality 
{

	@Override
	public String quality() {
		return "Showing vedio in low quality i.e. 144p , 240p";
	}

}
