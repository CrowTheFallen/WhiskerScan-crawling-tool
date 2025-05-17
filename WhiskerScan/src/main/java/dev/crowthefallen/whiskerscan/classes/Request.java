package dev.crowthefallen.whiskerscan.classes;

public class Request {

    public Urls urls;
    public UserAgent userAgent;
    public DelayBetweenRequests delayBetweenRequests;
    public Depth depth;
    public ExcludeExtensions excludeExtensions;
    public FollowSubdomains followSubdomains;
    public IncludeKeywords keywords;
    public MaxPages maxPages;
    public OutputFormat format;
    public OutputPath path;
    public RespectRobotsTxt robotsTxt;

    public Request(Urls urls,UserAgent userAgent,DelayBetweenRequests delayBetweenRequests,Depth depth,
                   ExcludeExtensions excludeExtensions,FollowSubdomains followSubdomains,
                   IncludeKeywords keywords,MaxPages maxPages,OutputFormat format,
                   OutputPath path,RespectRobotsTxt robotsTxt) {
        this.delayBetweenRequests = delayBetweenRequests;
        this.excludeExtensions = excludeExtensions;
        this.depth = depth;
        this.format = format;
        this.path = path;
        this.followSubdomains = followSubdomains;
        this.keywords = keywords;
        this.maxPages = maxPages;
        this.robotsTxt = robotsTxt;
        this.urls = urls;
        this.userAgent = userAgent;
    }

    public Request() {

    }
}
